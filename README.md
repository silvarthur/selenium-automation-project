# Selenium Automation Repository

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

## Generating Report Using Maven

Maven can be used to generate reports that presents the test results in friendlier way.
Running the command below will create a folder inside target that contains differents kinds
of reports.

```bash
mvn clean test site -Dbrowser=firefox
```

You can also execute the command above passing chrome as the option for the browser. To
open the test execution report directly, open the file target/site/surefire-report.html.
