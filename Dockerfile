FROM openjdk:11
EXPOSE 8089
ADD target/tpAchatProject-1.0.jar tpachatproject.jar
ENTRYPOINT ["java","-jar","/tpachatproject.jar"]