FROM  openjdk:16
COPY ./target/studentmgt-cli-0.0.1-SNAPSHOT.jar studentmgt-cli-0.0.1-SNAPSHOT.jar
ENV SPRING_PROFILES_ACTIVE profile_active
ENTRYPOINT ["java","-jar","studentmgt-cli-0.0.1-SNAPSHOT.jar"]



