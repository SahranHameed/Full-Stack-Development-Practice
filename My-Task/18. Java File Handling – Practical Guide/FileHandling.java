import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Task 18 - Java File Handling
// Covers: create folder, create file, write, read, delete

public class FileHandling {

    public static void main(String[] args) {

        System.out.println("JAVA FILE HANDLING DEMO");
        System.out.println("========================");

        // 1. create a folder
        System.out.println("\n1. Create Folder");
        File folder = new File("MyJavaFolder");
        if (folder.mkdir()) {
            System.out.println("Folder created: " + folder.getName());
        } else {
            System.out.println("Folder already exists, skipping.");
        }

        // 2. create a file
        System.out.println("\n2. Create File");
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

        // 3. write into the file
        System.out.println("\n3. Write File");
        try (FileWriter writer = new FileWriter("mydata.txt")) {
            writer.write("Hello, Java File Handling!\n");
            writer.write("This is line 2.\n");
            writer.write("This is line 3.\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Could not write to file: " + e.getMessage());
        }

        // 4. read the file back
        System.out.println("\n4. Read File");
        try (Scanner scan = new Scanner(new File("mydata.txt"))) {
            System.out.println("File Content:");
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }

        // 5. delete the file
        System.out.println("\n5. Delete File");
        File deleteFile = new File("mydata.txt");
        if (deleteFile.delete()) {
            System.out.println("File deleted: " + deleteFile.getName());
        } else {
            System.out.println("Could not find file to delete.");
        }

        System.out.println("\nAll file operations completed.");
    }
}
