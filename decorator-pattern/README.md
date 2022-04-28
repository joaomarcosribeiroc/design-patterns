# Desing Pattern - Decorator Pattern

Repository to studyng the desing pattern Decorator 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into strattegy pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd decorator-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/decorator-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/decorator-pattern (main) java -jar target/decorator-pattern-1.0.jar
  ```

Ok, now you will see the result of composing a class type using the decorator desing pattern.