# Assume jar is generated
FROM adoptopenjdk:11-jre-hotspot

USER root
WORKDIR /app
COPY target/ target/
ENTRYPOINT ["java", "-jar", "/app/target/echo-1.0.0.jar"]