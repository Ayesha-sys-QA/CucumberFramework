# 🥒 CucumberFramework – BDD Automation Framework

This is a Java-based test automation framework using **Cucumber**, **Selenium**, and **TestNG** following the principles of **Behavior-Driven Development (BDD)**.

---

## 🔧 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Cucumber (Gherkin syntax)
- Maven
- Git & GitHub
- Page Object Model (POM)

---

## 📂 Project Structure

```
src
 └── test
     ├── java
     │   ├── stepDefinitions/
     │   ├── pageObjects/
     │   └── testRunners/
     └── resources
         └── features/
```

---

## 🧪 Sample Feature

```gherkin
Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be redirected to the dashboard
```

---

## ✅ How to Run

1. Clone the repo:
```bash
git clone https://github.com/Ayesha-sys-QA/CucumberFramework.git
```

2. Navigate to the project:
```bash
cd CucumberFramework
```

3. Run tests via Maven:
```bash
mvn clean test
```

---

## 📌 Notes

- Supports both UI and API testing integrations
- Can be expanded with data-driven testing and reporting plugins (Allure, Extent)
- Designed to scale in Agile sprint cycles

---

## 👩‍💻 Author

**Aicha Moustatia**  
Senior QA Automation Engineer | [LinkedIn](https://linkedin.com/in/aicha-moustatia-qa)

---

*Available for remote QA roles – open to Swiss based projects 2026.*
