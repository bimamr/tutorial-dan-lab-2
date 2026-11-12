package L2Q3;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num1 = rand.nextInt(41) + 10;
        int num2 = rand.nextInt(41) + 10;
        int num3 = rand.nextInt(41) + 10;
        
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        
        System.out.println("Generated Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum of the numbers: " + sum);
        System.out.printf("Average of the numbers: %.2f\n", average);
    }
}
