FROM openjdk:8-jdk-alpine
MAINTAINER Sunil Rai <sunilrai7607@gmail.com>
VOLUME /app
ARG version
ENV version_number=$version
COPY ./build/libs/oauth2-resource-server-$version_number.jar oauth2-resource-server.jar
ENTRYPOINT ["java", "-jar","/oauth2-resource-server.jar"]