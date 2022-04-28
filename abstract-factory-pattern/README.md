# Desing Pattern - Factory Pattern

Repository to studyng the desing pattern Abstract-Factory 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into abstract-factory folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd abstract-factory
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/abstract-factory (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/abstract-factory (main) java -jar target/abstract-factory-1.0.jar
  ```

Ok, now you will see the result creating an object using a abstract factory, based on passed parameters