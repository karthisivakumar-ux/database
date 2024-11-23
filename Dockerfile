FROM eclipse-temurin:17
COPY target/database.jar database.jar
CMD ["java","-jar","database.jar"]