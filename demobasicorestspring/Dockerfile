FROM amazoncorretto:11-alpine-jdk

COPY ./target/demoMicroservicio-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch demoMicroservicio-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","demoMicroservicio-0.0.1-SNAPSHOT.jar"]
