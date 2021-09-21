FROM  openjdk:16
COPY ./target/studentmgt-web-0.0.1-SNAPSHOT.jar studentmgt-web-0.0.1-SNAPSHOT.jar
ENV SPRING_PROFILES_ACTIVE profile_active
EXPOSE 8080
ENTRYPOINT ["java","-jar","studentmgt-web-0.0.1-SNAPSHOT.jar"]



