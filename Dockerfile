FROM openjdk:11
ADD http://192.168.1.191:8082/repository/devops/com/esprit/examen/tpAchatProject/1.0/tpAchatProject-1.0.jar tpachatproject.jar
ENTRYPOINT ["java","-jar","/tpachatproject.jar"]