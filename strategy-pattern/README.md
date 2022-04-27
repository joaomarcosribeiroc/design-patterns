# Desing Pattern - Strategy Pattern

Repository to studyng the desing pattern Strategy 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into strattegy pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd strategy-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/strategy-pattern (main) java -jar target/strategy-pattern-1.0.jar
  ```

Ok, now press something and hit enter. The program will analyze your entered data and use the apropriate stratgy to print out the results.