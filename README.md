# QN1 Accounts UML - Project 3

## UML relationships

1. The `Account` class implements the `Statement` interface. This is called realization.
2. `SavingsAccount` extends `Account`. This is generalization or inheritance.
3. `CurrentAccount` extends `Account`. This is also generalization or inheritance.
4. `Customer` is linked to `Account` using aggregation. The customer stores accounts in a list.

## Multiplicity explanation

The diagram shows `1` for `Customer` and `0..*` for `Account`.

This means a customer can have zero or many accounts. Each account is connected to one customer.

## Running in NetBeans

Open NetBeans, click `File` > `Open Project`, and select this folder: `QN1-Accounts-UML-Project3`.

Then right-click the project and choose `Run`. NetBeans should recognize it as a Maven Java project because of the `pom.xml` file.

Terminal test:

```bash
javac src/*.java
java -cp src Main
```

Maven test:

```bash
mvn compile exec:java
```
