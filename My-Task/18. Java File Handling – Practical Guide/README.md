# ☕ Java File Handling – Practical Guide

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-5%2F5-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java program demonstrating all File Handling operations — Create Folder, Create File, Write File, Read File, and Delete File — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

All 5 operations run one after another inside a single file.

```
18. Java File Handling/
│
└── FileHandling.java     # Create Folder -> Create File -> Write -> Read -> Delete
```

---

## 📋 Task Summary

| # | Step | Class Used | Method |
|---|------|------------|--------|
| 01 | Create Folder | `File` | `mkdir()` |
| 02 | Create File | `File` | `createNewFile()` |
| 03 | Write File | `FileWriter` | `write()` |
| 04 | Read File | `Scanner` | `hasNextLine()` |
| 05 | Delete File | `File` | `delete()` |

---

## 🎯 Actual Program Output

```
JAVA FILE HANDLING DEMO
========================

1. Create Folder
Folder created: MyJavaFolder

2. Create File
File created: mydata.txt

3. Write File
Data written successfully.

4. Read File
File Content:
Hello, Java File Handling!
This is line 2.
This is line 3.
File read successfully.

5. Delete File
File deleted: mydata.txt

All file operations completed.
```

---

## 💡 Key Concepts Learned

### 📁 Create Folder — File Class
```java
File folder = new File("MyJavaFolder");

if (folder.mkdir()) {
    System.out.println("Folder created: " + folder.getName());
} else {
    System.out.println("Folder already exists, skipping.");
}
```

### 📄 Create File — File Class
```java
File file = new File("mydata.txt");

try {
    if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
    } else {
        System.out.println("File already exists.");
    }
} catch (IOException e) {
    System.out.println("Could not create file: " + e.getMessage());
}
```

### ✍️ Write File — FileWriter Class (try-with-resources closes it automatically)
```java
try (FileWriter writer = new FileWriter("mydata.txt")) {
    writer.write("Hello, Java File Handling!\n");
    writer.write("This is line 2.\n");
    writer.write("This is line 3.\n");
    System.out.println("Data written successfully.");
} catch (IOException e) {
    System.out.println("Could not write to file: " + e.getMessage());
}
```

### 📖 Read File — Scanner Class
```java
try (Scanner scan = new Scanner(new File("mydata.txt"))) {
    while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
    }
    System.out.println("File read successfully.");
} catch (IOException e) {
    System.out.println("Could not read file: " + e.getMessage());
}
```

### 🗑️ Delete File — File Class
```java
File deleteFile = new File("mydata.txt");

if (deleteFile.delete()) {
    System.out.println("File deleted: " + deleteFile.getName());
} else {
    System.out.println("Could not find file to delete.");
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
2. Close FileWriter and Scanner after use (done here with try-with-resources)
3. Check the return value of mkdir()/createNewFile()/delete() instead of assuming success
4. Use file.getName() to display file name in output
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
javac FileHandling.java
```

**4. Run**
```bash
java FileHandling
```

---

## 📌 Code Standards Followed

- ✅ Comments explaining file handling logic
- ✅ `IOException` handled with try-catch in all file operations
- ✅ File resources closed automatically with try-with-resources
- ✅ `PascalCase` for class names, `camelCase` for variables
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
