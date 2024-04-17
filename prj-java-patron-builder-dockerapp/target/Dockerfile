FROM openjdk:8-jre-alpine
COPY ./test-0.0.1-SNAPSHOT.jar /usr/share/test-0.0.1-SNAPSHOT.jar
WORKDIR /usr/share
ENTRYPOINT ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]