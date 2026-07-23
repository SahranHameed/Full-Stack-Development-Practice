# ☕ Java File Handling – Practical Guide

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-5%2F5-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java guide demonstrating all File Handling operations — Create Folder, Create File, Write File, Read File, and Delete File — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
18. Java File Handling/
│
├── Task01_CreateFolder.java      # Create a new directory/folder
├── Task02_CreateFile.java        # Create a new file
├── Task03_WriteFile.java         # Write data into a file
├── Task04_ReadFile.java          # Read data from a file
└── Task05_DeleteFile.java        # Delete an existing file
```

---

## 📋 Task Summary

| # | Program | Description | Class Used | Method |
|---|---------|-------------|------------|--------|
| 01 | Create Folder | Create a new directory | `File` | `mkdir()` |
| 02 | Create File | Create a new file | `File` | `createNewFile()` |
| 03 | Write File | Write text into a file | `FileWriter` | `write()` |
| 04 | Read File | Read content from file | `Scanner` | `hasNextLine()` |
| 05 | Delete File | Delete an existing file | `File` | `delete()` |

---

## 🎯 Sample Outputs

### Task 01 — Create Folder
```
Folder created successfully: MyFolder ✅
```

### Task 02 — Create File
```
File created successfully: myfile.txt ✅
```

### Task 03 — Write File
```
Writing to file...
Data written successfully! ✅
Content: "Hello, Java File Handling!"
```

### Task 04 — Read File
```
Reading file content:
─────────────────────
Hello, Java File Handling!
This is line 2.
This is line 3.
─────────────────────
File read successfully! ✅
```

### Task 05 — Delete File
```
File deleted successfully: myfile.txt ✅
```

---

## 💡 Key Concepts Learned

### 📁 Create Folder — File Class
```java
import java.io.File;

File folder = new File("MyFolder");

if (folder.mkdir()) {
    System.out.println("Folder created: " + folder.getName());
} else {
    System.out.println("Folder already exists!");
}
```

### 📄 Create File — File Class
```java
import java.io.File;
import java.io.IOException;

File file = new File("myfile.txt");

try {
    if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
    } else {
        System.out.println("File already exists!");
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### ✍️ Write File — FileWriter Class
```java
import java.io.FileWriter;
import java.io.IOException;

try {
    FileWriter writer = new FileWriter("myfile.txt");
    writer.write("Hello, Java File Handling!");
    writer.write("\nThis is line 2.");
    writer.close(); // Always close after writing!
    System.out.println("Written successfully!");
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### 📖 Read File — Scanner Class
```java
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

try {
    File file    = new File("myfile.txt");
    Scanner scan = new Scanner(file);

    while (scan.hasNextLine()) {        // Check if more lines exist
        String line = scan.nextLine();  // Read line by line
        System.out.println(line);
    }
    scan.close(); // Always close after reading!
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### 🗑️ Delete File — File Class
```java
File file = new File("myfile.txt");

if (file.delete()) {
    System.out.println("File deleted: " + file.getName());
} else {
    System.out.println("File not found!");
}
```

---

## 🔍 File Handling Operations Summary

| Operation | Class | Method | Exception |
|-----------|-------|--------|-----------|
| Create Folder | `File` | `mkdir()` | None |
| Create File | `File` | `createNewFile()` | `IOException` |
| Write File | `FileWriter` | `write()` | `IOException` |
| Read File | `Scanner` | `hasNextLine()` | `IOException` |
| Delete File | `File` | `delete()` | None |

---

## ⚠️ Important Rules

```
1. Always use try-catch for IOException
2. Always close FileWriter and Scanner after use
3. Check if file exists before reading/deleting
4. Use file.getName() to display file name
```

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/SahranHameed/Full-Stack-Development-Practice.git
```

**2. Navigate to the folder**
```bash
cd "Full-Stack-Development-Practice/My-Task/18. Java File Handling"
```

**3. Compile**
```bash
javac Task01_CreateFolder.java
```

**4. Run**
```bash
java Task01_CreateFolder
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining file handling logic
- ✅ `IOException` handled with try-catch in all file operations
- ✅ File resources closed after use (`writer.close()`, `scan.close()`)
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ Clear success and error messages displayed

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 17 | [Java Deadlock & Inter-Thread Communication](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/17.%20Java%20Deadlock%20%26%20Inter-Thread%20Communication) |
| 18 | [Java File Handling](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/18.%20Java%20File%20Handling) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
