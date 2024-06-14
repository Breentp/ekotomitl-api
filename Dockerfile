FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY build/libs/my-app.jar /app/
ENTRYPOINT ["java","-jar","/"my-app.jar"]
EXPOSE 8080