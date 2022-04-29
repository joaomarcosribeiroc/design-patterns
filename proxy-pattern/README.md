# Desing Pattern - Proxy Pattern

Repository to studyng the desing pattern Proxy 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into proxy-pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd proxy-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/proxy-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/proxy-pattern (main) java -jar target/proxy-pattern-1.0.jar
  ```

The heavy task of instatiating the book parser is performed only when we realy need