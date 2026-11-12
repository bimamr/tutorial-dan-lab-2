package L2Q6;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double waterInGrams = scanner.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialFahrenheit = scanner.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalFahrenheit = scanner.nextDouble();
        
        double m = waterInGrams / 1000.0;
        
        double initialCelsius = (initialFahrenheit - 32) / 1.8;
        double finalCelsius = (finalFahrenheit - 32) / 1.8;
        
        double q = m * (finalCelsius - initialCelsius) * 4184;
        
        System.out.printf("The energy needed is %e\n", q);
        
        scanner.close();
    }
}
