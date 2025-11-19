# Library Management System 📚

A simple Java console application for managing a library's book inventory. This project demonstrates core Object-Oriented Programming (OOP) concepts, ArrayList usage, and basic CRUD operations.

## Features

- ✅ Add new books to the library
- 📖 View all books in the collection
- 🔍 Search for books by ID
- 📤 Borrow books (mark as unavailable)
- 📥 Return books (mark as available)
- 💻 Menu-driven console interface

## Technologies Used

- **Language**: Java
- **Data Structure**: ArrayList
- **Concepts**: OOP, Encapsulation, Getters/Setters, Collections

## Project Structure

```
library-management-java/
├── src/
│   ├── Book.java          # Book class with properties and methods
│   └── LibraryApp.java    # Main application with menu interface
├── .gitignore
└── README.md
```

## Classes

### Book.java
- Represents a book entity with properties:
  - `bookId`: Unique identifier
  - `title`: Book title
  - `author`: Book author
  - `isAvailable`: Availability status
- Methods: getters, setters, displayBookInfo(), toString()

### LibraryApp.java
- Main application class with:
  - ArrayList to store books
  - CRUD operation methods
  - Menu-driven user interface
  - Sample data initialization

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Lokeshchowdary06/library-management-java.git
   cd library-management-java
   ```

2. **Compile the Java files**
   ```bash
   javac src/*.java
   ```

3. **Run the application**
   ```bash
   java -cp src LibraryApp
   ```

## Usage Example

When you run the application, you'll see a menu like this:

```
*** Welcome to Library Management System ***

--- Menu ---
1. Display All Books
2. Add New Book
3. Search Book
4. Borrow Book
5. Return Book
6. Exit
Enter your choice:
```

Simply enter the number corresponding to your desired action.

## Sample Books

The application comes pre-loaded with:
1. Java Programming by James Gosling
2. Clean Code by Robert Martin
3. Effective Java by Joshua Bloch

## Learning Outcomes

This project demonstrates:
- ✓ Object-Oriented Programming principles
- ✓ Class design and encapsulation
- ✓ ArrayList operations (add, search, iterate)
- ✓ User input handling with Scanner
- ✓ Menu-driven program flow
- ✓ Basic CRUD operations
- ✓ Code organization and structure

## Future Enhancements

- 💾 File persistence (save/load data)
- 👥 User management system
- 🔐 Authentication and authorization
- 📊 Generate reports
- 🎨 GUI interface
- 🗄️ Database integration

## Author

**Lokesh Chowdary**
- GitHub: [@Lokeshchowdary06](https://github.com/Lokeshchowdary06)

## License

This project is open source and available for educational purposes.

---

⭐ If you find this project helpful, please consider giving it a star!
