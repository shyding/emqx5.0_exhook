# emqx-exhook-springboot
A EMQX Broker exhook sample of springboot framework, start coding with exhook from ExhookGrpcServer.java


Build project

```
mvn clean compile
```

## Prerequisites

- JDK version 8 or higher
- Maven

## Run

```
mvn package
java -jar target/emqx-extension-springboot-0.0.1-SNAPSHOT.jar
```

## Test
Use this client to test authentication

client id : xxx

username : kp45

password : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjbGllbnRJZCI6Inh4eCIsImlzcyI6ImRvZ2UiLCJ1c2VybmFtZSI6ImtwNDUifQ.7tIzausNglk_mejxgA-nCDIB_RSk92JkZcpiR6vNI2Y

Also you can see how to generate a valid client password in [Verifier.java](https://github.com/kevinpan45/emqx-exhook-springboot/blob/d00739216dfbca4931b490bd1b3b0c18902742ee/src/main/java/io/kp45/exhook/Verifier.java) main method



#  test on emqx 5.0.4  on docker works very well, but 5.0.6  no hooks received 
