#FROM maven:3.9.6-amazoncorretto-17 AS builder
#COPY . /appbuild
#WORKDIR /appbuild
#
#RUN mvn clean package -DskipTests -f pom.xml
FROM openjdk:17-jdk-alpine
COPY  ./target/dubbo-samples-shop-comment-gray-0.0.1-SNAPSHOT.jar /appruntime/dubbo-samples-shop-comment-gray-0.0.1-SNAPSHOT.jar
WORKDIR /appruntime
RUN chmod +x /appruntime/dubbo-samples-shop-comment-gray-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/appruntime/dubbo-samples-shop-comment-gray-0.0.1-SNAPSHOT.jar"]