# 🧪 CucumberFramework – OrangeHRM Automation

This project automates test scenarios on the OrangeHRM demo site using Java, Selenium, TestNG, Maven, and Cucumber (BDD).

## ✅ Features Implemented

- 🔐 Login with valid credentials
- 👤 Add Employee with and without employee ID
- 🔍 Search Employee
- 🔎 Google Search sample (basic)

## 📂 Project Structure


CucumberFramework/
│
├── src/test/java
│ ├── com.test.pages # Page Object Model classes
│ ├── com.test.steps # Step Definitions
│ ├── com.test.runners # TestNG and Cucumber Runners
│ ├── com.test.utils # Utility classes (Browser utils, Configs, etc.)
│ └── com.test.testbase # Base classes (setup & teardown)
│
├── src/test/resources
│ └── features # Gherkin Feature files
│
├── pom.xml # Maven dependencies
└── README.md # Project documentation
```


## 🛠 Technologies Used

- Java
- Selenium WebDriver
- Cucumber BDD
- Maven
- Git & GitHub
- Eclipse IDE

## ▶️ How to Run the Tests

From terminal (make sure Maven is installed):

```bash
mvn test
Or from Eclipse:
Right-click the test runner → Run As → TestNG Test or JUnit Test


2. Navigate to the project:
```bash
cd CucumberFramework
```

3. Run tests via Maven:
```bash
mvn clean test
```

---

⚙️ Prerequisites
Java 11+ installed

Maven installed

Chrome WebDriver in system PATH

Eclipse or IntelliJ

## 👩‍💻 Author

**Aicha Moustatia**  
QA Automation | GitHub: [Ayesha-sys-QA](https://github.com/Ayesha-sys-QA)

