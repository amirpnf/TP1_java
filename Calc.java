import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    // Show a request
    System.out.println("Enter a number: ");
    int value_1 = scanner.nextInt(); // integer variable
    int value_2 = scanner.nextInt(); // Same thing
    System.out.println(value_1 + value_2); // We are going to print:
    System.out.println(value_1 - value_2); // the difference,
    System.out.println(value_1 * value_2); // the product,
    System.out.println(value_1 / value_2); // the quotient and
    System.out.println(value_1 % value_2); // the divide remaining.
  }
}
