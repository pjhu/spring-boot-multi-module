./gradlew clean build
java -Dserver.port=8081 -jar projectone/build/libs/projectone-0.0.1-SNAPSHOT.jar &
java -Dserver.port=8082 -jar projecttwo/build/libs/projecttwo-0.0.1-SNAPSHOT.jar &
