Module 1 Course 2 Assignment 1
1.Write a Java program to print 'Hello' on screen and then print your name on a separate line.
public class Name {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Swethaa");
    }
}
Output
Hello
Swethaa

2.Write a Java program to print the sum of two numbers.
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

Output
Enter the first number: 10
Enter the second number: 20
The sum of 10 and 20 is: 30
3.Write the program in java based on the following primitive datatypes using any IDE. a. Double b. Char c. Float d. Boolean e. Int
public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        double doubleVar = 12345.6789;
        System.out.println("Double value: " + doubleVar);
        char charVar = 'A';
        System.out.println("Char value: " + charVar);
        float floatVar = 9876.5432f;
        System.out.println("Float value: " + floatVar);
        boolean booleanVar = true;
        System.out.println("Boolean value: " + booleanVar);
        int intVar = 100000;
        System.out.println("Int value: " + intVar);
    }
}
Output
Double value: 12345.6789
Char value: A
Float value: 9876.543
Boolean value: true
Int value: 100000

4.Write a java program to take two integer variables a and b and store 10 and 3 respectively and print the remainder without using modulus operator.
public class RemainderWithoutModulus {
    public static void main(String[] args) {
        int a = 10; 
        int b = 3;  
        int remainder = a;
        while (remainder >= b) {
            remainder -= b;
        }
        System.out.println("The remainder when " + a + " is divided by " + b + " is: " + remainder);
    }
}
Output
The remainder when 10 is divided by 3 is: 1

5.What is the output of following code snippet?
Public static void main (String [] args) {
Double a = 10;
Into b = 5 ;
System.out.println (a%b);
}
Output:
Runtime error

6.Write the program to type’s caste int datatype into float datatype in java
public class IntToFloatCasting {
    public static void main(String[] args) {
        int intValue = 42;
        float floatValue = intValue;
        System.out.println("Integer value: " + intValue);
        System.out.println("Float value after typecasting: " + floatValue);
    }
}
Output
Integer value: 42
Float value after typecasting: 42.0

Problem Statement 2:
1. Write the program to add two numbers by choosing the following types of operations in
Java.
a) Addition
b) Subtraction
c) Multiplication
d) Division
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
Output:
Enter the first number: 10
Enter the second number: 5
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0

2. Write the program to calculate the sum up to N Numbers and sum of divisors in java.
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sum up to N numbers
        System.out.print("Enter a value for N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + N + " numbers: " + sum);

        // Sum of divisors of a number
        System.out.print("Enter a number to find the sum of its divisors: ");
        int num = sc.nextInt();
        int sumOfDivisors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        System.out.println("Sum of divisors of " + num + ": " + sumOfDivisors);
    }
}
Output
Enter a value for N: 5
Sum of first 5 numbers: 15
Enter a number to find the sum of its divisors: 6
Sum of divisors of 6: 12

3. Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        // Finding the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
    }
}
Output
Enter the first number: 10
Enter the second number: 20
Enter the third number: 15
The greatest number is: 20

4.Write a Java program to create an array of 5 integers. Initialize it. Print all values in even cells in the array using for loop.
public class EvenIndexArrayValues {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Values at even indices:");
        for (int i = 0; i < numbers.length; i++) {
            // Check if the index is even
            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        }
    }
}
Output:
Values at even indices:
Index 0: 10
Index 2: 30
Index 4: 50

5. Create a class Rectangle with length and breadth properties. Write a default constructor to assign default length and breadth with the value 10. Also write a parameter constructor to initialize length and breadth with any given values. Write the main program to test the functionality of Rectangle class. Use the "this" keyword wherever it is required.
public class Rectangle {
    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        this.length = 10;
        this.breadth = 10;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to display the dimensions of the rectangle
    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Creating an object with default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle created with default constructor:");
        rect1.display();

        // Creating an object with parameterized constructor
        Rectangle rect2 = new Rectangle(15, 20);
        System.out.println("\nRectangle created with parameterized constructor:");
        rect2.display();
    }
}

Output:
Rectangle created with default constructor:
Length: 10.0
Breadth: 10.0

Rectangle created with parameterized constructor:
Length: 15.0
Breadth: 20.0

6. Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'print Salary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign the name, age, phone number, address and salary to an employee and a
manager by making an object of both classes and print the same".
// Base class Member
class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }

    // Method to display member details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Derived class Employee
class Employee extends Member {
    private String specialization;

    // Method to set employee details
    public void setEmployeeDetails(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    // Method to display employee details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Derived class Manager
class Manager extends Member {
    private String department;

    // Method to set manager details
    public void setManagerDetails(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        emp.setEmployeeDetails("John Doe", 30, "555-1234", "123 Elm St", 60000, "Software Engineering");
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println();

        // Create a Manager object
        Manager mgr = new Manager();
        mgr.setManagerDetails("Jane Smith", 40, "555-5678", "456 Oak St", 80000, "HR Department");
        System.out.println("Manager Details:");
        mgr.displayDetails();
    }
}
Output
Name: John Doe
Age: 45
Phone Number: 123-456-7890
Address: 123 Main St
Salary: 75000.0
Department: Sales

7. Write the program to check whether no is ""prime"" or not by-passing parameter in a method in java.
public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Edge cases
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Any other even number is not prime
        }
        
        // Check for factors from 3 to sqrt(number)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    // Main method to test the isPrime method
    public static void main(String[] args) {
        int number = 29; // Example number to check
        boolean result = isPrime(number);
        
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
Output
29 is a prime number.
