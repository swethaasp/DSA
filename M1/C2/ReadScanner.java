import java.util.Scanner;

public class ReadScanner {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();
    System.out.println("The sum is " + (a + b) + ".");

  }
}


import java.util.Scanner;

public class StockChangeCalculator {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter the stock symbol: ");
    String symbol = sc.nextLine();
    System.out.printf("Enter %s's day 1 value: ", symbol);
    double day1 = sc.nextDouble();
    System.out.printf("Enter %s's day 2 value: ", symbol);
    double day2 = sc.nextDouble();
    double percentChange = 100 * (day2 - day1) / day1;
    System.out.printf("%s has changed %.2f%% in one day.", symbol, percentChange);   // displays the result with two decimal places
  }
}
//output
Enter the stock symbol: AAPL
Enter AAPL's day 1 value: 150
Enter AAPL's day 2 value: 155
AAPL has changed 3.33% in one day.


// //In Java, the nextLine() method is used to read a line of text from the input, including spaces. It captures everything the user types until they press Enter.
// Why nextLine() is Used:
// Reading Strings with Spaces: If the stock symbol or any other input can include spaces, nextLine() is useful because it reads the entire line, unlike next() which reads only up to the first space.
