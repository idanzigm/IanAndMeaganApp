FROM openjdk:8

COPY ./build.gradle ./
RUN sdk install gradle 7.5.1

COPY . . 

RUN gradle clean 
RUN gradle fatJar

FROM nginx
COPY --from=builder build/libs/*.jar dockerapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]