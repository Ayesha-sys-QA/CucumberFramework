# CucumberFramework
BDD Automation Framework using Cucumber, Selenium, Java, and TestNG


This project is a Behavior-Driven Development (BDD) test automation framework using **Cucumber**, **Selenium WebDriver**, **Java**, and **TestNG**.  
It follows the Page Object Model (POM) design pattern and is integrated with Maven for build management.

## 🧪 Purpose

The goal is to demonstrate how BDD can be used to write readable, maintainable, and scalable automated test scripts for web applications.  
Scenarios are written in Gherkin and linked to Java step definitions for execution.

## 🚀 Tools & Technologies

- Java 11+
- Cucumber (BDD Framework)
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- GitHub

📁 Project Structure
CucumberFramework/
├── src/
│ └── test/
│ ├── java/
│ │ ├── stepDefinitions/ # Step definitions (glue code)
│ │ ├── runners/ # Cucumber TestRunner classes
│ │ └── pages/ # Page Object classes
│ └── resources/
│ └── features/ # .feature files (Gherkin)
├── pom.xml # Project dependencies
└── README.md # Project documentation

## ✅ How to Run Tests

1. Clone the repository.
2. Open the project in IntelliJ or Eclipse.
3. Run the `TestRunner.java` class from the `runners` package.
4. Results will be shown in the console and/or reports directory.

## 📌 Example Scenario

```gherkin
Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And clicks the login button
    Then User should be redirected to the dashboard

## 📊 Reports

Test execution reports can be generated using TestNG or other plugins (extent reports, Allure, etc.).


