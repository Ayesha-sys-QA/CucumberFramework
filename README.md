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

### 📌 Report Includes:
- ✅ Passed / ❌ Failed Scenarios  
- 🔍 Step-by-step execution logs  
- 📸 Screenshots on failure  
- ⏱ Execution time per scenario

---

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

