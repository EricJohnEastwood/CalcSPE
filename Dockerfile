FROM openjdk:8
EXPOSE 8080
WORKDIR /
ADD  target/CalcSPE-1.0-SNAPSHOT-jar-with-dependencies.jar  CalcSPE-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "CalcSPE-1.0-SNAPSHOT-jar-with-dependencies.jar"]



