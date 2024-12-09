# Real-Time Smart Alert System for IoT Devices

| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | AMAN JAIN                  |
| Date         | 12/03/2024                 |
| Course       | Fall                       |


# Project Overview

The Real-Time Smart Alert System for IoT Devices is a robust, scalable solution designed to manage real-time alerts for Internet of Things (IoT) devices. It identifies critical events and notifies users dynamically, enhancing response time and reliability in IoT ecosystems.

# GitHub Repository Link:
https://github.com/Aman23000/SDP_Final_Project_Amanjain.git

# Key Features 

IoT Device Simulator: Generates real-time test data for simulation and testing.

Event Manager: Logs device events using the Event Sourcing Pattern.

Notification Manager: Sends real-time notifications using the Observer Pattern.

Alert Manager: Escalates critical alerts based on predefined strategies using the Strategy Pattern.

Enhanced Notifications: Adds dynamic behaviors (e.g., email, SMS) to alerts using the Decorator Pattern.

# Workflow

IoT devices generate event data.

The Event Manager logs the data.

The Notification Manager sends appropriate alerts.

The Alert Manager escalates alerts based on type and priority.

Additional alert features (e.g., format changes or additional notification channels) are dynamically added via decorators.

# Design Pattern Used

Event Sourcing Pattern: Efficiently logs real-time events for better traceability.

Observer Pattern: Dynamically updates notifications to subscribed systems or users.

Strategy Pattern: Enables flexible alert escalation strategies.

Decorator Pattern: Dynamically adds additional functionality to alerts, such as support for new notification channels or formats.

# Project Structure
 Modules:

`IoTDeviceSimulator.java`: Simulates real-time IoT device data.

`EventManager.java`: Captures and manages event data.

`NotificationManager.java`: Processes and sends notifications.

`AlertManager.java`: Manages and escalates critical alerts.

`Decorator.java`: Adds dynamic behavior to alerts, such as SMS or email.

Testing: Includes JUnit tests to ensure code reliability and correctness.

UML Diagram: Detailed class diagram provided for better understanding of the architecture.

# Compilation and Execution

Prerequisites

Java Development Kit (JDK 1.8 or later).

Maven (for project build and dependencies).

Git (for version control).

Clone the repository: 
```bash
git clone [repository-url]
cd [repository-folder]
```

Run the application: 
```bash
SmartAlertSystemMain
```
# Maven Commands

We’ll use Apache Maven to compile and run this project. You can install it from https://maven.apache.org/.

Apache Maven is a powerful build automation and project management tool for Java projects. It offers a standardized approach to build, package, and deploy applications.

Maven uses a Project Object Model (POM) file to manage builds and dependencies. The POM file includes details about the project, such as its dependencies, build configurations, and the plugins used for tasks like packaging and testing.

Maven simplifies dependency management by using a centralized repository, making it easier to handle external libraries. It also ensures consistent and repeatable builds across different environments.

Maven integrates well with IDEs and continuous integration tools, streamlining its use in the development workflow. Additionally, it has a wide range of plugins for tasks like compiling code, running tests, generating reports, and creating JAR files, making it highly versatile for Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```

## JUnit Tests
JUnit is a widely used testing framework for Java, designed to automate the testing process and verify that code behaves as expected.

In JUnit, tests are written as methods within a test class, with each method testing a specific functionality. These methods are marked with the @Test annotation. JUnit offers various assertions to validate the behavior of the code being tested.

JUnit tests are run automatically, with results reported to help developers quickly identify and fix issues. This makes it easy to ensure that the code works as intended.

JUnit plays a key role in Test-Driven Development (TDD), where tests are written before the actual code. This approach ensures that the code is testable and that all functionality is covered by tests.

JUnit tests can also be integrated into a continuous integration (CI) pipeline, where they are executed automatically with each code change. This helps catch issues early, reduces the need for manual testing, and ensures the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`

# Challenges

Handling real-time event data efficiently.

Configuring tools like SpotBugs and resolving code warnings.

# Learnings

mportance of modular design for maintainability.

Best practices in software testing and debugging.

# Future Enhancements

Adding push notifications and voice calls as new notification channels.

Integrating predictive analytics to forecast potential device failures.

Creating real-time dashboards for enhanced IoT monitoring.

Expanding to cloud platforms for better scalability.

Introducing customizable alert escalation strategies.


