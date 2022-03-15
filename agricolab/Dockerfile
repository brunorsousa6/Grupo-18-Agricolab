FROM openjdk:11
VOLUME /tmp
ADD target/agricolab.jar agricolab.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/agricolab.jar"]