# 🔪 Cucumber Automation Framework

A Behavior-Driven Development (BDD) test automation framework using **Java**, **Cucumber**, **TestNG**, and **Maven**.

---

## 🚀 How to Run Tests

### ✅ Option 1: From Eclipse
- Right-click on `TestRunner.java`  
- Select `Run As` → `Maven test`

### ✅ Option 2: From Terminal
```bash
mvn clean test
```

---

## 📈 Test Report

After test execution, an HTML report is generated at:  
`target/cucumber-html-reports/overview-features.html`

---
## 📊 Test Execution Report

The test suite was executed using Maven and Cucumber. The HTML report includes scenario status, steps, and screenshots.

📁 Report Location: `target/cucumber-html-reports/overview-features.html`

🔗 [View Report in Repository](https://github.com/Ayesha-sys-QA/CucumberFramework/blob/main/target/cucumber-html-reports/overview-features.html)

🖼️ Screenshots are embedded in the report for failed scenarios.

## 🧩 Test Coverage

### ✅ Login Functionality  
- Valid and invalid credential handling

### ✅ Add Employee With Personal Details  
- Personal info form validation  
- Data-driven testing (Excel utility integration)

---

## 📁 Project Structure

```
CucumberFramework/
├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   ├── stepDefinitions/
│       │   ├── runners/
│       │   ├── pages/
│       │   └── utilities/
│       └── resources/
│           └── features/
├── pom.xml
├── README.md
```

---

## 🛠 Tech Stack
- Java  
- Maven  
- Cucumber  
- TestNG  
- Selenium WebDriver  
- Masterthought HTML Reports

---

## 🙋‍♀️ Author

**Aicha Moustatia**  
QA Automation Engineer | [GitHub](https://github.com/Ayesha-sys-QA)

