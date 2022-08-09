FROM openjdk:8
COPY . . 
RUN BootJar

FROM nginx
COPY --from=builder build/libs/*.jar dockerapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]