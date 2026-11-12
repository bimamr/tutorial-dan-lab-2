package L2Q5;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Range 0 to 10000 inclusive
        int number = rand.nextInt(10001);
        
        int temp = number;
        int sumOfDigits = 0;
        
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Generated Random Number: " + number);
        System.out.println("Sum of all digits: " + sumOfDigits);
    }
}
