# CucumberFramework

This is a Java-based test automation framework using **Cucumber**, **Selenium WebDriver**, **TestNG**, and **Maven**. It follows the Page Object Model (POM) and uses BDD with Gherkin syntax for easy-to-read test scenarios.

## 🚀 Features

- BDD testing with Cucumber and Gherkin
- Web automation using Selenium WebDriver
- Test execution with Maven
- Integrated HTML reports (via net.masterthought plugin)
- Screenshot capture for failed steps
- Clear separation of pages, steps, runners, and utilities

## 📂 Project Structure

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

## 🛠 Technologies Used

- Java
- Selenium WebDriver
- Cucumber BDD
- Maven
- Git & GitHub
- Eclipse IDE


## 🧪 How to Run Tests

### From Eclipse:
> Right-click `TestRunner.java` → `Run As` → `Maven test`
### From terminal:
```bash
mvn clean test

📊 Cucumber HTML Report
Generated automatically at:
target/cucumber-html-reports/overview-features.html

📸 Sample Executed Scenarios
✅ Validate Dashboard Menu Items

✅ Google Search test with "Cucumber testing" keyword

👩‍💻 Author
Aicha Moustatia
🧪 QA Engineer | Automation | Selenium | Cucumber | Java
🔗 GitHub – Ayesha-sys-QA



