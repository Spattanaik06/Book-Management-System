# Book Management System

## 📌 Project Overview

The **Book Management System** is a **Spring Boot** application designed to manage books by allowing users to **add, edit, delete, and list books** efficiently. It uses **Spring MVC, Thymeleaf, and Bootstrap** for a clean user interface and **MySQL** for data storage.

## 🎯 Features

- ✅ **Add a Book** (Name, Author, Price)
- ✅ **View Book List** with alternating row colors
- ✅ **Edit Book Details**
- ✅ **Delete a Book**
- ✅ **Spring Boot MVC with Thymeleaf UI**
- ✅ **MySQL Database Integration**
- ✅ **Bootstrap for Responsive Design**

## ⚙️ Technologies Used

- **Backend:** Java, Spring Boot, Spring MVC, Spring Data JPA
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Database:** MySQL
- **Tools & IDE:** Eclipse/IntelliJ IDEA, Git/GitHub, Postman


## 🖥️ API Endpoints

| Method | Endpoint       | Description    |
| ------ | -------------- | -------------- |
| `GET`  | `/booklist`    | View all books |
| `GET`  | `/savebook`    | Show add form  |
| `POST` | `/savebook`    | Add a new book |
| `GET`  | `/edit/{id}`   | Edit a book    |
| `POST` | `/update/{id}` | Update book    |
| `GET`  | `/delete/{id}` | Delete a book  |



## 🔥 Future Enhancements

- 📌 Implement user authentication
- 📌 Add search and filter features
- 📌 REST API for external integrations



