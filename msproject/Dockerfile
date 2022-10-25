#FROM maven:3.6.0-jdk-11-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package

#FROM openjdk:8
#COPY --from=build /home/app/target/msproject.jar /home/demo.jar
#EXPOSE 8080
#ADD target/msproject.jar msproject.jar
#ENTRYPOINT ["java","-jar","/demo.jar"]

FROM openjdk:8
EXPOSE 8080
ADD target/msproject.jar msproject.jar
ENTRYPOINT ["java","-jar","/msproject.jar"]