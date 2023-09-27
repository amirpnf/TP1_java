import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        // Afficher la demande
        System.out.println("Enter a number: ");
        
        int value_1 = scanner.nextInt(); // variable de type integer
        int value_2 = scanner.nextInt(); // Pareil
         
        
        
        System.out.format("%d \n", value_1 + value_2);
        System.out.format("%d \n", value_1 - value_2);
        System.out.format("%d \n", value_1 * value_2);
        System.out.format("%d \n", value_1 / value_2);
        System.out.format("%d \n", value_1 % value_2);

    }
}