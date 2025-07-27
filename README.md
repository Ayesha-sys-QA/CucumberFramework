# 🥒 CucumberFramework

This project is a Java-based test automation framework that uses **Cucumber**, **Selenium WebDriver**, **TestNG**, and **Maven**. It follows the **Page Object Model (POM)** and leverages **BDD** with Gherkin syntax to describe test cases in a readable and maintainable way.

---

## 🔧 Technologies Used

- Java
- Selenium WebDriver
- Cucumber (BDD with Gherkin)
- TestNG
- Maven
- JUnit (runner integration)
- Cucumber Reporting (via `net.masterthought` plugin)

---

## 📁 Project Structure


src
├── main
│ └── java
│ └── com.test.utils
├── test
│ ├── java
│ │ ├── com.test.steps
│ │ ├── com.test.pages
│ │ └── com.test.runners
│ └── resources
│ └── features
│ ├── Dashboard.feature
│ └── GoogleSearch.feature



---

## ▶️ How to Run Tests

### ✅ Option 1: Run from Eclipse
Right-click `TestRunner.java` → **Run As** → **Maven test**

### ✅ Option 2: Run from Terminal
```bash
mvn clean test
📊 Reporting
After execution, reports are available:

Local HTML report:
target/cucumber-html-reports/overview-features.html
✅ Executed Scenarios
Validate the main menu items on the dashboard

Google search with the keyword "Cucumber testing"

Each scenario includes:

* Screenshot on execution

* Console logs

* HTML reports

👩‍💻 Author
Aicha Moustatia
QA Automation Engineer
📍 GitHub Profile


