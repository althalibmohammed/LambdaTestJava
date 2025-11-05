# LambdaTest Playground Automation (Selenium + TestNG)

This project automates three scenarios from the [LambdaTest Selenium Playground](https://www.lambdatest.com/selenium-playground) using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.

---

## 🚀 Tech Stack
- **Language:** Java 17+
- **Build Tool:** Maven
- **Framework:** TestNG
- **Automation Library:** Selenium 4
- **Driver Management:** WebDriverManager
- **Browsers:** Chrome, Edge

---

## ⚙️ Project Structure
src
└── test
└── java
├── base
│ └── BaseTest.java
└── tests
├── SimpleFormDemoTest.java
├── DragDropSliderTest.java
└── InputFormSubmitTest.java
pom.xml
testng.xml
README.md


---

## 🧠 Test Scenarios

### ✅ **Test Scenario 1: Simple Form Demo**
1. Open [LambdaTest Playground](https://www.lambdatest.com/selenium-playground)
2. Click **“Simple Form Demo”**
3. Validate that the URL contains `simple-form-demo`
4. Enter message: `Welcome to LambdaTest`
5. Click **“Get Checked Value”**
6. Verify that the same message appears in the output panel

---

### ✅ **Test Scenario 2: Drag & Drop Sliders**
1. Open the playground and click **“Drag & Drop Sliders”**
2. Drag the slider with **Default value 15** to **95**
3. Verify that the range value shows **95**

---

### ✅ **Test Scenario 3: Input Form Submit**
1. Click **“Input Form Submit”**
2. Click **Submit** without filling fields → verify **“Please fill out this field.”**
3. Fill in all required details  
4. Select **United States** from the country dropdown  
5. Submit the form  
6. Verify success message:
   > “Thanks for contacting us, we will get back to you shortly.”

---

## 🧩 Setup & Execution

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/LambdaTestAutomation.git
cd LambdaTestAutomation
