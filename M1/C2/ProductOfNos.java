public class ProductOfNos {

  public static void main(String[] args) {
    System.out.println("Enter the first number");
    int var1 = Integer.parseInt(System.console().readLine());  //System.console().readLine() reads the input as a string from the console.Integer.parseInt() converts the string input to an integer and stores it in var1.
    System.out.println("Enter the Second number");
    int var2 = Integer.parseInt(System.console().readLine());
    System.out.printf("The product of the two numbers is %d", (var1 * var2));  //
  }

}
// //Formatted Output: System.out.printf() allows for formatting the output in a more controlled way, including specifying how numbers, strings, and other data types should be displayed.
// %d Placeholder: In this context, %d is used to insert an integer value into the output string, making it easier to format and display the result of the multiplication with the surrounding text.



//1. next() (Scanner)
Stops Reading: When it encounters whitespace (e.g., space, tab, newline).
  Sample Input/Output:
Input: Hello World
Output: Hello (the first word is captured, the rest is ignored for this call).

 // 2. nextLine() (Scanner)
  Use Case: Reading an entire line of text, including spaces.
Behavior: nextLine() reads the entire line of input until it encounters a newline character.
Stops Reading: After reading the newline character, it returns the string up to (but not including) the newline.

  Sample Input/Output:
Input: Hello World
Output: Hello World (the entire line is captured).


  //3.ReadLine(consule based)
Use Case: Reading an entire line of text (usually in older or more direct console-based applications).
  
Yes, readLine() can be used to read both strings and characters, but it reads the input as a string. If you want to read a single character using readLine(), you need to extract the character from the string. Here's how it works:

1. Reading a String with readLine()
Behavior: readLine() reads the entire line of input as a string until a newline character is encountered.

  //Use readLine() when working with a console-based application that doesn't use Scanner






  /*

  Summary:
For Strings: Use next() for a word, and nextLine() or readLine() for a full line.
For Characters: Extract a character using charAt(0) after reading a string with next(), nextLine(), or readLine().
  */
