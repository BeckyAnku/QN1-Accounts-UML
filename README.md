

## Running in NetBeans

Open NetBeans, click `File` > `Open Project`, and select this folder: QN1-Accounts-UML.

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
