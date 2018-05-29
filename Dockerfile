FROM openjdk:8-jdk-alpine
MAINTAINER tra@kb.dk

RUN mkdir /verapdf
WORKDIR /verapdf
COPY verapdf-rest-docker.yml .
COPY target/verapdf-rest.jar .
CMD java -jar verapdf-rest.jar server verapdf-rest-docker.yml
