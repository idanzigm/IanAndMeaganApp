# the first stage of our build will use a maven 3.6.1 parent image
FROM gradle:jdk8 AS GRADLE_BUILD

# copy the pom and src code to the container
COPY ./ ./

# package our application code
RUN gradle clean 
RUN gradle fatJar

# the second stage of our build will use open jdk 8 on alpine 3.9
FROM openjdk:8-jre-alpine3.9

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=GRADLE_BUILD /RegistryBackend/build/lib/RegistryBackend-0.0.1-SNAPSHOT.jar /registry.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/registry.jar"]