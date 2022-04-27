# Desing Pattern - Observer Pattern

Repository to studyng the desing pattern Observer 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into strattegy pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd observer-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/observer-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/observer-pattern (main) java -jar target/observer-pattern-1.0.jar
  ```

Ok, now each three seconds, an observable will notify its observers about something, in this case it is that three secconds has passed.