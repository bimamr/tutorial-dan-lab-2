package L2Q2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter car price (P): ");
        double p = scanner.nextDouble();
        
        System.out.print("Enter down payment (D): ");
        double d = scanner.nextDouble();
        
        System.out.print("Enter interest rate in % (R): ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter loan duration in years (Y): ");
        double y = scanner.nextDouble();
        
        double monthlyPayment = (p - d) * (1 + (r * y / 100.0)) / (y * 12);
        
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        
        scanner.close();
    }
}
