FROM  openjdk:16
COPY ./target/studentmgt-cli-0.0.1-SNAPSHOT.jar studentmgt-cli-0.0.1-SNAPSHOT.jar
ENV active_profile="--spring.profiles.active=inMemoryRepository"
ENTRYPOINT ["java","-jar","studentmgt-cli-0.0.1-SNAPSHOT.jar"]



