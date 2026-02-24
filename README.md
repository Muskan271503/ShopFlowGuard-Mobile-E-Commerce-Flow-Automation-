🛒 ShopFlowGuard
Mobile E-Commerce Flow Automation using Appium & Java
📌 About The Project

ShopFlowGuard is a mobile automation testing project developed to validate the end-to-end shopping workflow of a mobile e-commerce application using Appium, Java, and TestNG.

This framework simulates real user interactions and verifies that critical business flows such as product search, cart operations, and checkout navigation are functioning correctly.

The project demonstrates:

Practical implementation of mobile automation

Structured framework design

Reusable Page Object Model (POM)

Synchronization handling

Automated screenshot capturing

Organized TestNG execution

🎯 Key Features

✔ Automated product search
✔ Product selection & size selection
✔ Add to cart validation
✔ Cart price verification
✔ Checkout navigation validation
✔ Screenshot capture at every major step
✔ Modular and scalable framework

🏗️ Framework Architecture
Test Script (Java + TestNG)
            ↓
Appium Client Library
            ↓
Appium Server
            ↓
Android Device / Emulator
            ↓
Mobile Application (Under Test)
            ↓
Execution Results (Logs & Screenshots)

The framework follows a layered architecture for better maintainability and scalability.

🛠️ Tech Stack
Tool	Purpose
Appium	Mobile automation framework
Java	Programming language
TestNG	Test execution & reporting
Android SDK	Device configuration
Appium Inspector	UI element identification
📂 Project Structure
src
 ├── base
 │     BaseTest.java
 ├── pages
 │     HomePage.java
 │     ProductPage.java
 │     CartPage.java
 │     CheckoutPage.java
 ├── tests
 │     E2EOrderTest.java
 └── utils
       ScreenshotUtil.java
🔹 BaseTest

Driver initialization

Capability configuration

Server connection

Driver teardown

🔹 Page Classes

Store locators

Reusable UI action methods

Follows Page Object Model

🔹 Test Class

Executes complete end-to-end flow

Performs validations

🔹 Screenshot Utility

Captures screenshots automatically

Stores execution evidence

🚀 How To Run This Project
1️⃣ Prerequisites

Java (JDK 8+)

Node.js installed

Appium installed

Android SDK configured

Real device or emulator connected

Appium Server running

2️⃣ Start Appium Server
appium
3️⃣ Verify Connected Device
adb devices
4️⃣ Run the Test

Execute:

E2EOrderTest.java

Using TestNG.

✅ Test Scenarios Covered

Launch Application

Search Product

Select Product

Select Size

Add to Cart

Open Cart

Validate Price

Proceed to Checkout

⚠️ Challenges & Solutions
🔹 Application Launch Activity Not Exported

Solution: Used only appPackage and allowed Appium to detect default launch activity.

🔹 Dynamic Elements & Synchronization

Solution: Implemented explicit waits and stable locator strategies.

🔹 Scrolling for Off-Screen Elements

Solution: Used Appium UIAutomator scroll methods.

📊 Results

Successfully executed full shopping workflow

Screenshots captured at each stage

Stable automation execution

Reduced manual testing effort

🔮 Future Enhancements

Login automation

Payment gateway automation

CI/CD integration

Data-driven testing

Multi-device parallel execution

📚 Learning Outcomes

Through this project, I gained hands-on experience in:

Mobile automation testing

Appium framework implementation

Page Object Model design

Synchronization handling

Real device execution

Structured test architecture

👩‍💻 Author

Muskan
Mobile Automation Tester
Appium | Java | TestNG
