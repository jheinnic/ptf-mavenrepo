FROM openjdk:8u191-alpine
EXPOSE 4545
RUN mkdir /app
WORKDIR /app
COPY target/dependency/basic-service-0.0.1-SNAPSHOT.jar /app/basic-service-0.0.1-SNAPSHOT.jar
CMD java ${JAVA_OPTS} -jar /app/basic-service-0.0.1-SNAPSHOT.jar
