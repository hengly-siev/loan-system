# 🏦 Java Loan Management System

This Java-based Loan Management System is a console application that simulates the process of approving and calculating various types of loans using Object-Oriented Programming (OOP) principles. It includes models for customers, loans, and services that encapsulate core business logic.

---

## 📌 Features

- 🧑 Customer profile and income verification
- 🏠 Support for different loan types: Personal Loan, Car Loan, Home Loan
- 📊 Monthly payment calculation based on interest rate and loan term
- ✅ Loan approval logic with simple business rules
- 🧠 Clean OOP design using abstraction, inheritance, interfaces, and encapsulation

---

## 🧠 OOP Principles Used

| Principle       | Implementation                                  |
|------------------|--------------------------------------------------|
| Abstraction       | Abstract class `Loan` defines general structure |
| Inheritance       | `PersonalLoan`, `HomeLoan`, `CarLoan` extend `Loan` |
| Polymorphism      | `getInterestRate()` is overridden per loan type |
| Encapsulation     | `Customer` class has private fields with getters/setters |
| Interface-based   | `LoanCalculator` interface with `StandardLoanCalculator` implementation |
| Separation of Concerns | Logic separated across service and model packages |

---


## 🚀 How to Run

### ✅ Prerequisites
- Java JDK 22 or later
- Java IDE (e.g., IntelliJ IDEA, VS Code)

### ▶️ Steps
1. **Clone the repository**
   ```bash
   git clone https://github.com/hengly4433/loan-system.git

### 💻 Sample Output

Loan Approved for Hengly Siev. Monthly Payment: 21.25

## Or if loan conditions are not satisfied:

Loan Rejected


### 🛠 Technologies Used
Java 22+

IntelliJ IDEA or Visual Studio Code

No third-party dependencies

## 👨‍💻 Author
Hengly Siev
📧 henglysiev4433@gmail.com
🔗 [LinkedIn](https://www.linkedin.com/in/siev-hengly-41b3b0179/)