# PoC of Keycloak and Spring boot

I'll be adding a docker-compose to automate everything around here, but so far, none exist. Please execute the following steps to get your Keycloak instance running prior to the execution of `./gradlew bootRun`:

1. Execute: `docker run -p 8080:8080 -e KEYCLOAK_USER=<USERNAME> -e KEYCLOAK_PASSWORD=<PASSWORD> jboss/keycloak`
1. Open `http://localhost:8080` 
1. Configure a realm called `sample-app`
1. Create a user
    1. Do not forget to set a password 
1. Configure a role called `users`
1. Associate the created user to the `users` role
1. Configure a client called `spring-app`

### References

#### Keycloak overview:

- [Securing apps and services with Keycloak authentication | DevNation Live](https://www.youtube.com/watch?v=mdZauKsMDiI)
- [What is Keycloak and what are the main features | DevNation Live](https://www.youtube.com/watch?v=ZxpY_zZ52kU)

#### Spring Boot applications with Keycloak:

- [A Quick Guide to Using Keycloak with Spring Boot](https://www.baeldung.com/spring-boot-keycloak)
- [Easily secure your Spring Boot applications with Keycloak - Part 1](https://youtu.be/vpgRTPFDHAw)
- [Easily secure your Spring Boot applications with Keycloak - Part 2](https://youtu.be/O5ePCWON08Y)
- [Easily secure and add Identity Management to your Spring Boot applications by Sebastien Blanc](https://youtu.be/3I4TXPxCCVE)
- [How to secure your Spring Apps with Keycloak by Thomas Darimont @ Spring I/O 2018](https://youtu.be/haHFoeWUj0w)
- [How to secure your Spring apps with Keycloak by Thomas Darimont @ Spring I/O 2019](https://youtu.be/KrOd5wIkqls)