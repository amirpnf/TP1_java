import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {

    Scanner scanner  = new Scanner(System.in);

    // Afficher une demande d'entrée
    System.out.println("Enter a number: ");

    int value_1 = scanner.nextInt(); // variable de type integer
    int value_2 = scanner.nextInt(); // Pareil



    System.out.println(value_1 + value_2); // Nous allons afficher:
    System.out.println(value_1 - value_2); // la soustraction,
    System.out.println(value_1 * value_2); // le produit,
    System.out.println(value_1 / value_2); // le quotient,
    System.out.println(value_1 % value_2); // et le reste.

  }
}
