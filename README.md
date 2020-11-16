# jooqGen
## generation of jooq classes by scripts liquibase with testcontainers
To generate classes, use testcontainers.

### Generation includes the following steps:
1) Launching the database in testcontainers
2) Run the Liquibase scripts on this database
3) Clean the directory with old generation files jooq
4) Generating fresh files jooq
5) Stop the database

### To change the database you need
1) Add dependency in pom.xml for database driver
2) Add dependency to pom.xml for database for testcontainers 
3) In class JooqGen change: 
~~~~
    DOCKER_IMAGE_NAME
    DRIVER_CLASS
    replace PostgreSQLContainer to your DB container name
~~~~

### How to use
You can put class JooqGen in your project and, if necessary, 
run it to update the generated classes when changes in liquibase scripts

### Run
from cl
```cmd
mvn exec:java -Dexec.mainClass="ru.ver.JooqGen"
```
or run class from your favorite IDE
