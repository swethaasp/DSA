M1C2A2
1.	Write small code using abstract keyword in java.

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();
    
    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete class extending the abstract class
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}


// Main class to test the abstract class
public class AbstractExample {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog myDog = new Dog();
        
        // Call the abstract method
        myDog.makeSound();
        
        // Call the regular method
        myDog.sleep();
    }
}

Output

Woof Woof
This animal is sleeping.

2.	Create the abstract class in java and create abstract methods and non-abstract method in the parent class then create the child class and inherit the parent class and implements the abstract method inside the child class in java
// Abstract class definition
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Non-abstract method (has a body)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Concrete subclass implementation
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();
        
        // Call the abstract method implementation
        myDog.makeSound();
        
        // Call the non-abstract method inherited from Animal
        myDog.eat();
    }
}

Output
The dog barks. 
This animal eats food.


3.	Create an interface in java and create the abstract method inside the interface then create the child class and implements that interface and provide the definition of the methods in the child class in java.

// Define the interface
public interface AnimalInterface {
    // Abstract method
    void makeSound();

    // Default method with a body
    default void eat() {
        System.out.println("This animal eats food.");
    }
}

// Implement the interface in a class
public class Dog implements AnimalInterface {
    // Provide implementation for the abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // Optionally override the default method
    @Override
    public void eat() {
        System.out.println("The dog eats kibble.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Call the abstract method
        myDog.makeSound(); // Output: The dog barks.
        
        // Call the default method
        myDog.eat(); // Output: The dog eats kibble.
    }
}

Output
The dog barks. 
The dog eats kibble.

4.	Write a java program to store 5 integers in an array and print the array in reverse order using java.

public class ReverseArray {
    public static void main(String[] args) {
        // Initialize the array with 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
Output

Array in reverse order:
50 40 30 20 10

5.Write the program to override the toString function and based on Primitive datatypes and compare and sort the array in java.
   import java.util.Arrays;
   class CustomNumber {
    private int number;

    public CustomNumber(int number) {
        this.number = number;
    }

    // Override toString method to provide a meaningful string representation
    @Override
    public String toString() {
        return "CustomNumber: " + number;
    }

    // Getter for the number
    public int getNumber() {
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of CustomNumber objects
        CustomNumber[] customNumbers = {
            new CustomNumber(15),
            new CustomNumber(5),
            new CustomNumber(25),
            new CustomNumber(10),
            new CustomNumber(20)
        };

        // Print the array before sorting
        System.out.println("Array before sorting:");
        printArray(customNumbers);

        // Sort the array using a custom comparator
        Arrays.sort(customNumbers, (a, b) -> Integer.compare(a.getNumber(), b.getNumber()));

        // Print the array after sorting
        System.out.println("Array after sorting:");
        printArray(customNumbers);

        // Working with primitive arrays
        int[] intArray = {15, 5, 25, 10, 20};
        double[] doubleArray = {15.5, 5.5, 25.5, 10.5, 20.5};

        // Print and sort int array
        System.out.println("Integer array before sorting:");
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Integer array after sorting:");
        System.out.println(Arrays.toString(intArray));

        // Print and sort double array
        System.out.println("Double array before sorting:");
        System.out.println(Arrays.toString(doubleArray));
        Arrays.sort(doubleArray);
        System.out.println("Double array after sorting:");
        System.out.println(Arrays.toString(doubleArray));
    }

    // Helper method to print CustomNumber array
    private static void printArray(CustomNumber[] array) {
        for (CustomNumber num : array) {
            System.out.println(num);
        }
    }
}
Output
Array before sorting:
CustomNumber: 15
CustomNumber: 5
CustomNumber: 25
CustomNumber: 10
CustomNumber: 20
Array after sorting:
CustomNumber: 5
CustomNumber: 10
CustomNumber: 15
CustomNumber: 20
CustomNumber: 25

Integer array before sorting:
[15, 5, 25, 10, 20]
Integer array after sorting:
[5, 10, 15, 20, 25]

Double array before sorting:
[15.5, 5.5, 25.5, 10.5, 20.5]
Double array after sorting:
[5.5, 10.5, 15.5, 20.5, 25.5]

6.Write the program to compare the string using the following string methods in java using
Eclipse IDE
A. By ""== "" method
B. By ""equals ""method
C. By ""compare To"" method

public class StringComparison {

    public static void main(String[] args) {
        // Strings to compare
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "World";

        // A. By "==" method
        System.out.println("A. Using '==' method:");
        System.out.println("str1 == str2: " + (str1 == str2));   // true, same reference
        System.out.println("str1 == str3: " + (str1 == str3));   // false, different reference

        // B. By "equals" method
        System.out.println("\nB. Using 'equals()' method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));   // true, same content
        System.out.println("str1.equals(str3): " + str1.equals(str3));   // true, same content
        System.out.println("str1.equals(str4): " + str1.equals(str4));   // false, different content

        // C. By "compareTo" method
        System.out.println("\nC. Using 'compareTo()' method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));   // 0, same content
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));   // 0, same content
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));   // negative, str1 is lexicographically less than str4
    }
}

Output
A. Using '==' method:
str1 == str2: true
str1 == str3: false

B. Using 'equals()' method:
str1.equals(str2): true
str1.equals(str3): true
str1.equals(str4): false

C. Using 'compareTo()' method:
str1.compareTo(str2): 0
str1.compareTo(str3): 0
str1.compareTo(str4): -15

7. Write a Java program to concatenate a given string to the end of another string.
public class StringConcatenation {

    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1.concat(str2);
        System.out.println("Concatenated String: " + result);
    }
}
Output
Concatenated String: Hello, World!

Problem Statement 4: 
1.	Write the program to create a file and write the content in a file and read from a file in java.

import java.io.*;

public class FileOperations {

    public static void main(String[] args) {
        // Specify the file name
        String fileName = "example.txt";

        // Content to write to the file
        String contentToWrite = "Hello, this is a test content for file operations in Java.";

        // Write content to the file
        writeToFile(fileName, contentToWrite);

        // Read content from the file
        readFromFile(fileName);
    }

    // Method to write content to a file
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading content from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
Output
Content successfully written to the file.
Reading content from the file:
Hello, this is a test content for file operations in Java.

2.	Write a Java program to calculate the average value of array elements.

public class AverageCalculator {

    public static void main(String[] args) {
        // Initialize the array with some values
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the average
        double average = calculateAverage(numbers);

        // Print the average
        System.out.printf("The average value of the array elements is %.2f%n", average);
    }

    // Method to calculate the average of array elements
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return (double) sum / array.length;
    }
}

Output
The average value of the array elements is 30.00


3.	Write a Java program to create a new array list, add some elements (string) and print out the collection.
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print out the collection
        System.out.println("The ArrayList contains:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

Output
The ArrayList contains:
Apple
Banana
Cherry
Date
Elderberry

4. Write a Java Program to create a Generic Class with the name "Swapper" that contain a static generic method "do Swap()" that takes two arguments.
public class Swapper {

    // Static generic method to swap two values
    public static <T> void doSwap(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Invalid index positions.");
        }
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Swap elements at index 1 and 3
        doSwap(intArray, 1, 3);

        System.out.println("After swapping: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example with String array
        String[] strArray = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Before swapping: ");
        for (String fruit : strArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Swap elements at index 0 and 2
        doSwap(strArray, 0, 2);

        System.out.println("After swapping: ");
        for (String fruit : strArray) {
            System.out.print(fruit + " ");
        }
    }
}

Output
Before swapping: 
1 2 3 4 5 
After swapping: 
1 4 3 2 5 
Before swapping: 
Apple Banana Cherry Date 
After swapping: 
Cherry Banana Apple Date

5	Write a Java program to append the specified element to the end of a linked list
import java.util.LinkedList;

public class LinkedListAppendExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); 
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Original LinkedList: " + list);
        String newElement = "Date";
        list.addLast(newElement);
        System.out.println("LinkedList after appending '" + newElement + "': " + list);
    }
}

Output
Original LinkedList: [Apple, Banana, Cherry]
LinkedList after appending 'Date': [Apple, Banana, Cherry, Date]

6.	Write a Java program to count the number of key-value  (size) mappings in a map

import java.util.HashMap;
import java.util.Map;

public class MapSizeExample {
    public static void main(String[] args) {
        // Create a HashMap with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Print the original map
        System.out.println("Original Map: " + map);

        // Count the number of key-value mappings
        int size = map.size();

        // Print the size of the map
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

Output

Original Map: {Apple=1, Banana=2, Cherry=3, Date=4}
Number of key-value mappings in the map: 4

7.Write a Java program to clone a tree set list to another tree set.

import java.util.TreeSet;

public class TreeSetCloneExample {
    public static void main(String[] args) {
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Cherry");
        originalSet.add("Date");

        
        System.out.println("Original TreeSet: " + originalSet);

        // Clone the original TreeSet to a new TreeSet
        TreeSet<String> clonedSet = new TreeSet<>(originalSet);

        // Print the cloned TreeSet
        System.out.println("Cloned TreeSet: " + clonedSet);
    }
}
Output

Original TreeSet: [Apple, Banana, Cherry, Date]
Cloned TreeSet: [Apple, Banana, Cherry, Date]



