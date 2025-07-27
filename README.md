# 🧪 Cucumber Framework – Automation Project

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/Ayesha-sys-QA/CucumberFramework)
[![Java](https://img.shields.io/badge/Java-11-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![TestNG](https://img.shields.io/badge/TestNG-enabled-orange)](https://testng.org/)

This is a Java Selenium Cucumber framework using TestNG and Maven. It automates scenarios defined in Gherkin syntax and uses step definitions for test execution.

---

## 🧰 Prerequisites

- Java 11+
- Maven
- Eclipse or IntelliJ
- ChromeDriver

---

## 🚀 How to Run Tests

Run tests from terminal:

```bash
mvn test
```

Or right-click `RegressionRunner.java` → Run As → TestNG Test

---

## 📂 Project Structure

```
src
└── test
    ├── java
    │   ├── com.neotech.steps        # Step Definitions
    │   ├── com.test.runners         # Runner Classes
    │   └── com.neotech.utils        # Utilities (Excel, Config, etc.)
    └── resources
        └── features                 # Cucumber Feature Files
```

---

## 🧾 Reports

After execution, view:

- HTML report: `target/cucumber-html-reports/overview-features.html`
- JSON report: `target/cucumber.json`

---

## 📸 Screenshots

On failure, screenshots are saved in: `target/screenshots/`

---

## 💡 Sample Feature (Login)

```gherkin
Feature: Login Functionality

  Scenario: Valid login
    Given I open the login page
    When I enter valid credentials
    Then I should see the welcome message
```

---

## ✅ Maintained by

**Ayesha-sys-QA**  
[GitHub Profile](https://github.com/Ayesha-sys-QA)
