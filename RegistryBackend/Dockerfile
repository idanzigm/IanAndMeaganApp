FROM ubuntu:latest
EXPOSE 8080

RUN sudo apt-get install openjdk-8-jdk
RUN curl -s "https://get.sdkman.io" | bash
RUN sdk install gradle 7.5.1

COPY . . 

RUN gradle clean 
RUN gradle fatJar

FROM nginx
COPY --from=builder build/libs/*.jar dockerapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]