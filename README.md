# Library Management System (Java)

## Overview

This project is a console-based Library Management System built using Java. It simulates basic library operations such as user registration, login authentication, and role-based access for admin and regular users.

---

## Features

### Authentication System

* User Registration
* Login validation using username and password
* Duplicate username prevention

### User Roles

* Admin
* Regular User

### Core Concepts Used

* Object-Oriented Programming (OOP)
* Inheritance (Admin & RegularUser classes)
* Encapsulation (password protection using methods)
* ArrayList as in-memory database

---

## Project Structure

```
libraryManagementSystem/
 ├── main.java
 ├── database/
 │    ├── users.java
 │    ├── admin.java
 │    ├── regularUser.java
```

---

## How It Works

1. User selects:

   * Login or Register
2. Registration:

   * Stores user data in an ArrayList
3. Login:

   * Searches user in ArrayList
   * Verifies password using method
4. Role-based access:

   * Admin or User identified after login

---

## Limitations

* No database (data resets after program ends)
* No GUI (console-based)
* No persistent storage

---

## Future Improvements

* Add file/database storage (MySQL / File Handling)
* Implement book management (issue/return system)
* Add GUI (JavaFX / Swing)
* Password encryption

---

## Technologies Used

* Java
* IntelliJ IDEA

---

## Author

Pruthvi Karnik
