M1C2A3
Assignment 3
1. Write the program based on IO Exception using the following keywords in java IDE.
A. try.
B. catch
C. finally
D. throw
E. throws
import java.io.*;
public class ExceptionHandlingExample {
    
    // Method that throws a checked exception
    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = null;
        try {
            // Attempt to open and read the file
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            // Always executed, whether exception occurs or not
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
    
    // Method that explicitly throws an exception
    public static void throwCustomException() throws Exception {
        throw new Exception("This is a custom exception.");
    }
    
    public static void main(String[] args) {
        try {
            readFile("testfile.txt"); // Assuming this file does not exist
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        try {
            throwCustomException();
        } catch (Exception e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}



2.Write the program to handle the following exceptions in java IDE. 
a. Checked Exceptions b. Unchecked Exceptions

Checked Exceptions:
import java.io.*;

public class CheckedExceptionExample {
    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
    
    public static void main(String[] args) {
        try {
            readFile("testfile.txt"); // File does not exist
        } catch (IOException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
    }
}

Unchecked Exceptions:
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        // Example of ArithmeticException
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
        
        // Example of NullPointerException
        try {
            String str = null;
            int length = str.length(); // Accessing method on null object
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
    }
}
