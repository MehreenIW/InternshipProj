FROM  openjdk:16
COPY ./target/studentmgt-web-0.0.1-SNAPSHOT.jar studentmgt-web-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENV active_profile="--spring.profiles.active=inMemoryRepository"
ENTRYPOINT ["java","-jar","studentmgt-web-0.0.1-SNAPSHOT.jar"]



