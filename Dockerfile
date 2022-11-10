FROM openjdk:11
ADD http://192.168.1.191:8082/service/rest/v1/search/assets/download?sort=version&repository=devops&maven.groupId=com.esprit.examen&maven.artifactId=tpAchatProject&maven.extension=jar tpachatproject.jar
ENTRYPOINT ["java","-jar","/tpachatproject.jar"]