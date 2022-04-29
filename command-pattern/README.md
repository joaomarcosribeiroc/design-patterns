# Desing Pattern - Command Pattern

Repository to studyng the desing pattern Command 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into strattegy pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd command-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/command-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/command-pattern (main) java -jar target/command-pattern-1.0.jar
  ```

Ok, now you will see the result of composing a class type using the command desing pattern.