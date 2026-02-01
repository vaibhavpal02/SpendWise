SpendWise – Core Java Expense Tracking System


📌 Project Summary

SpendWise is a console-based personal expense tracking application built using Core Java. The project demonstrates a clear understanding of object-oriented programming concepts and structured application design by separating business logic, data models, and user interaction into well-defined layers.

This project was developed as a learning-focused, end-to-end Java application following SDLC principles.



🎯 Why This Project

To apply Core Java concepts in a real-world finance use case

To understand how Java applications are structured in industry

To practice clean separation between UI, logic, and data

To build confidence in designing Java applications independently



⚙️ Key Features

Add expenses with amount, category, date, and notes

View all recorded expenses

Delete expenses using a unique expense ID

Calculate total expenses

Input validation using custom exceptions



🧱 Application Design

The project follows a layered architecture with clear responsibility separation:

model
Contains expense data models and an abstract base class for shared behavior.

manager
Handles all business logic such as validation, expense management, and calculations.

exceptions
Custom exceptions for handling invalid amount and empty category scenarios.

util
Utility interfaces defining calculation contracts.

main
Entry point of the application containing menu-driven user interaction.

This structure improves readability, maintainability, and scalability.



🧠 Concepts & Technologies Used

Core Java

Object-Oriented Programming (OOP)

Abstraction

Inheritance

Interfaces

Encapsulation

Constructor overloading

Custom exception handling

Collections (ArrayList)

Console-based menu-driven application



▶️ How to Run the Application

Clone the repository

Open the project in IntelliJ IDEA or Eclipse

Ensure JDK is properly configured

Run SpendWiseApp from the main package



📸 Sample Output (Console)
<img width="552" height="412" alt="image" src="https://github.com/user-attachments/assets/83b4295f-804d-42e0-9c63-ea9aabf35f2a" />
<img width="1021" height="282" alt="image" src="https://github.com/user-attachments/assets/59e12d01-ffd7-4217-838e-4381e838eef8" />
<img width="419" height="263" alt="image" src="https://github.com/user-attachments/assets/d72a54fd-3f87-4228-a92e-6d899b07e0f1" />



🚀 Future Enhancements

Edit existing expenses

Filter expenses by category or month

Persist data using file handling or database

Convert to a Spring Boot backend application


📄 Note

This project is developed for learning and skill demonstration purposes using Core Java.
