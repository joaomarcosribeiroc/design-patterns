# Desing Pattern - Adapter Pattern

Repository to studyng the desing pattern Adapter 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into strattegy pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd adapter-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/adapter-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/adapter-pattern (main) java -jar target/adapter-pattern-1.0.jar
  ```

Ok, now press something and hit enter. The program will analyze your entered data and use the apropriate stratgy to print out the results.