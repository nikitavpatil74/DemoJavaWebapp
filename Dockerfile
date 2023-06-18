FROM openjdk:8
EXPOSE 8080
ADD target/demojavawebapp.jar demojavawebapp.jar
ENTRYPOINT ["java","-jar","/demojavawebapp.jar"]
