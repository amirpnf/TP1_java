import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        
        int value = scanner.nextInt(); // variable de type integer
        // Afficher la demande 
        System.out.println("Enter a number: ");
        
        System.out.format("%d \n", value);

    }
}