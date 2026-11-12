package T2Q7;

import java.util.Scanner;

public class T2Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value in inch: ");
        double inches = scanner.nextDouble();
        
        // 1 inch = 2.54 cm -> 2.54 / 100 meters
        double meters = (inches * 2.54) / 100.0;
        
        System.out.printf("%.2f inches = %.2f meters\n", inches, meters);
        
        scanner.close();
    }
}
