package T2Q5;

import java.util.Scanner;

public class T2Q5 {
    public static void main(String[] args) {
        double amount = 32.5;
        amount += 10;
        System.out.println("The amount is " + amount);

        String chapter = "Summary";
        System.out.println(chapter);

        int num = 0;
        num++;
        int num1 = num;
        System.out.println("num1: " + num1);

        int number = 3000;
        System.out.printf("%4.2f\n", (double) number);


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter contact: ");
        String contact = keyboard.nextLine();
        System.out.println("Contact entered: " + contact);
        
        keyboard.close();
    }
}
