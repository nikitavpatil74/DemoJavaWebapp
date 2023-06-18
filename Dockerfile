FROM openjdk:8
EXPOSE 8080
ADD target/demojavawebapp.war demojavawebapp.war
ENTRYPOINT ["java","-war","/demojavawebapp.war"]
