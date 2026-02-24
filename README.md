# 🛒 ShopFlowGuard  
### 📱 Mobile E-Commerce Flow Automation using Appium & Java

![Appium](https://img.shields.io/badge/Appium-Mobile%20Automation-green)
![Java](https://img.shields.io/badge/Java-Programming-orange)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red)
![Android](https://img.shields.io/badge/Platform-Android-blue)

---

## 📌 About The Project

**ShopFlowGuard** is a mobile automation testing framework designed to validate the complete end-to-end shopping workflow of a mobile e-commerce application.

Built using **Appium, Java, and TestNG**, this project simulates real user behavior and verifies that critical business flows such as product search, cart validation, and checkout navigation are working correctly.

---

## 🎯 Key Features

✔ Automated product search  
✔ Product selection & size selection  
✔ Add-to-cart validation  
✔ Cart price verification  
✔ Checkout navigation validation  
✔ Screenshot capture at major steps  
✔ Modular & scalable framework design  

---

## 🏗️ Framework Architecture

```
Test Script (Java + TestNG)
        ↓
Appium Client Library
        ↓
Appium Server
        ↓
Android Device / Emulator
        ↓
Mobile Application (AUT)
        ↓
Execution Results (Logs & Screenshots)
```

The framework follows a layered architecture to ensure maintainability and scalability.

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| Appium | Mobile Automation Framework |
| Java | Programming Language |
| TestNG | Test Execution & Reporting |
| Android SDK | Device Configuration |
| Appium Inspector | UI Element Identification |

---

## 📂 Project Structure

```
src
 ├── base
 │    └── BaseTest.java
 ├── pages
 │    ├── HomePage.java
 │    ├── ProductPage.java
 │    ├── CartPage.java
 │    └── CheckoutPage.java
 ├── tests
 │    └── E2EOrderTest.java
 └── utils
      └── ScreenshotUtil.java
```

---

## 🔹 Framework Components

### 🔸 BaseTest
- Driver initialization  
- Capability configuration  
- Appium server connection  
- Driver teardown  

### 🔸 Page Classes (POM)
- Store element locators  
- Reusable UI action methods  
- Follows Page Object Model design  

### 🔸 Test Class
- Executes complete end-to-end shopping flow  
- Performs validations  

### 🔸 Screenshot Utility
- Captures screenshots automatically  
- Stores execution evidence  

---

## 🚀 How To Run This Project

### 1️⃣ Prerequisites

- Java (JDK 8+)  
- Node.js installed  
- Appium installed  
- Android SDK configured  
- Real device or emulator connected  
- Appium Server running  

---

### 2️⃣ Start Appium Server

```bash
appium
```

---

### 3️⃣ Verify Connected Device

```bash
adb devices
```

---

### 4️⃣ Run the Test

Execute:

```
E2EOrderTest.java
```

Using TestNG.

---

## ✅ Test Scenarios Covered

- Launch Application  
- Search Product  
- Select Product  
- Select Size  
- Add to Cart  
- Open Cart  
- Validate Price  
- Proceed to Checkout  

---

## ⚠️ Challenges & Solutions

### 🔹 Application Launch Activity Not Exported
**Solution:** Used only `appPackage` and allowed Appium to detect default launch activity.

### 🔹 Dynamic Elements & Synchronization
**Solution:** Implemented explicit waits and stable locator strategies.

### 🔹 Scrolling for Off-Screen Elements
**Solution:** Used Appium UIAutomator scroll methods.

---

## 📊 Results

✔ Successfully executed full shopping workflow  
✔ Screenshots captured at each stage  
✔ Stable automation execution  
✔ Reduced manual testing effort  

---

## 🔮 Future Enhancements

- Login automation  
- Payment gateway automation  
- CI/CD integration  
- Data-driven testing  
- Multi-device parallel execution  

---

## 📚 Learning Outcomes

Through this project, I gained hands-on experience in:

- Mobile automation testing  
- Appium framework implementation  
- Page Object Model design  
- Synchronization handling  
- Real device execution  
- Structured test architecture  

---

## 👩‍💻 Author

**Muskan**  
Mobile Automation Tester  
Appium | Java | TestNG  

---

⭐ If you found this project useful, consider giving it a star!
