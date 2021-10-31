# Selenium Automation Repository

## Dependencies

**Maven** must be installed on the machine on which the project will be running.

The project was implemented using **Java** 14. If you are using a different version, the pom.xml
file must be updated. The part of code that has to be updated is right below:

    <properties>
        <maven.compiler.source>14</maven.compiler.source>
        <maven.compiler.target>14</maven.compiler.target>
    </properties>

## Executing The Test Project

The test cases can be executed using Chrome or Firefox.

Executing with Chrome:
```bash
mvn clean test -Dbrowser=chrome
```

Executing Firefox:
mvn clean test -Dbrowser=firefox
```bash
mvn clean test -Dbrowser=firefox
```

## Generating Reports Using Maven

Maven can be used to generate reports that presents the test results in friendlier way.
Running the command below will create a folder inside target that contains differents kinds
of reports.

```bash
mvn clean test site -Dbrowser=firefox
```

You can also execute the command above passing chrome as the option for the browser. To
open the test execution report directly, open the file target/site/surefire-report.html.

## Saving Test Evidences

Whenever a test fails a screenshot is taken and saved in the src/test/screenshot folder.
The format of the image file is .png.