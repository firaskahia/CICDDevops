pipeline {
    agent any
    environment {
        NEXUS_VERSION = "nexus3"
        NEXUS_PROTOCOL = "http"
        NEXUS_URL = "192.168.2.210:8082"
        NEXUS_REPOSITORY = "devops"
        NEXUS_CREDENTIAL_ID = "nexus-user-credentials"

        registry = "dhiasouidi/pipeline"
        registryCredential = "dockerHub"
        dockerImage = ''
    }


    tools {
        maven 'M2_HOME'
        jdk 'JAVA_HOME'
    }
    stages {
        stage('Checkout GIT') {
            steps {
                echo 'Pulling from Github'
                git branch: 'dhia',
                        url: 'https://github.com/firaskahia/CICDDevops.git'

            }
        }
        stage('Build') {
            steps {
                git url: 'https://github.com/firaskahia/CICDDevops.git', branch: 'dhia'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage('Test') {
            steps {
                // Get some code from a GitHub repository
                sh "mvn test"
            }

        }

        stage('SonarQube Tests') {
            steps {
                sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
            }
        }
        stage("Publish to Nexus Repository Manager") {
            steps {
                script {
                    pom = readMavenPom file: "pom.xml"
                    filesByGlob = findFiles(glob: "target/*.${pom.packaging}")
                    echo "${filesByGlob[0].name} ${filesByGlob[0].path} ${filesByGlob[0].directory} ${filesByGlob[0].length} ${filesByGlob[0].lastModified}"
                    artifactPath = filesByGlob[0].path
                    artifactExists = fileExists artifactPath
                    if (artifactExists) {
                        echo "*** File: ${artifactPath}, group: ${pom.groupId}, packaging: ${pom.packaging}, version ${pom.version}"
                        nexusArtifactUploader(nexusVersion: NEXUS_VERSION,
                                protocol: NEXUS_PROTOCOL,
                                nexusUrl: NEXUS_URL,
                                groupId: pom.groupId,
                                version: pom.version,
                                repository: NEXUS_REPOSITORY,
                                credentialsId: NEXUS_CREDENTIAL_ID,
                                artifacts: [[artifactId: pom.artifactId,
                                             classifier: '',
                                             file      : artifactPath,
                                             type      : pom.packaging],
                                            [artifactId: pom.artifactId,
                                             classifier: '',
                                             file      : "pom.xml",
                                             type      : "pom"]])
                    } else {
                        error "*** File: ${artifactPath}, could not be found"
                    }
                }
            }
        }


        stage('Building our Docker image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        stage('Deploy our Docker image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning up Docker Images') {
            steps {
                sh "docker rmi $registry:latest"
            }
        }
        stage('Starting Docker-Compose') {
            steps {
                sh "/usr/local/bin/docker-compose up -d"
                sh "/usr/local/bin/docker-compose ps"
            }
        }
    }
    post {
        failure {
            mail to: "dhiaeddine.souidi@esprit.tn",
                    subject: "Build Fail",
                    body: "Fail"
        }
    }
}