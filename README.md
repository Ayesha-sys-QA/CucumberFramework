🧪 **Cucumber Framework – Automation Project**  
This project is a basic Java Selenium Cucumber framework using TestNG and Maven. It automates scenarios based on feature files and step definitions.

---

🚀 **How to Run Tests**

- Run from Terminal:  
  ```
  mvn test
  ```
- Or right-click the runner class `RegressionRunner.java` and select:  
  `Run As → TestNG Test`

---

📂 **Project Structure**

```
src
└── test
    └── java
        ├── com.neotech.steps        # Step Definitions
        ├── com.test.runners         # Runner Classes
        └── com.neotech.utils        # Utilities (Excel, Config, etc.)
    └── resources
        └── features                 # Cucumber Feature Files
```

---

🧾 **Reports**

- After test execution, an HTML report is generated at:  
  `target/cucumber-html-reports/overview-features.html`

- You can also check the JSON report at:  
  `target/cucumber.json`

---

📸 **Screenshots**

- Screenshots on failure are saved automatically in:  
  `target/screenshots/`

---

✅ *Maintained by [Ayesha-sys-QA](https://github.com/Ayesha-sys-QA)*
