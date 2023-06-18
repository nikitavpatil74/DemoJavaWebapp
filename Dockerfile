FROM openjdk:8
EXPOSE 8080
ADD target/DemoJavaWebapp.jar DemoJavaWebapp.jar
ENTRYPOINT ["java","-jar","/DemoJavaWebapp.jar"]
