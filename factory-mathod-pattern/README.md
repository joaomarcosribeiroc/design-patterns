# Desing Pattern - Factory-Method Pattern

Repository to studyng the desing pattern Factory-Method 

## Prerequisites
- Maven 3.63
- Java 8

## How To Run
First, if you are at the root directory of this repo, head into factory-method-pattern folder:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns (main) cd factory-method-pattern
  ```
Now, package the project using Maven:

 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/factory-method-pattern (main) mvn package spring-boot:repackage
  ```
Finally, run the app using `java` command:
 ```{r, engine='bash', count_lines}
  foo@bar: /design-patterns/factory-method-pattern (main) java -jar target/factory-method-pattern-1.0.jar
  ```

Ok, now you will see the result creating an object using a factory-Method, based on passed parameters