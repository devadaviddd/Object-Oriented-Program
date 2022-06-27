//2.  Write a program that repeatedly prompts the user to enter a positive integer and checks
    //whether the number is divisible by both 5 and 6, or neither of them, or just one of
    //them. The program ends when the user enters a negative integer or zero.

import java.util.Scanner;

public class Modulus5Or6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a positive integer: ");
            input = myObj.nextInt();

            if(input <= 0) {
                System.out.println("Goodbye!");
                break;
            }

            if(input % 5 == 0 && input % 6 == 0) {
                System.out.println(input + " is divisible by both 5 and 6");
            } else if(input % 5 == 0 || input % 6 == 0) {
                System.out.println(input + " is divisible by 5 or 6, but not both");
            } else {
                System.out.println(input + " is neither divisible by 5 nor 6");
            }

        } while (input > 0);
    }
}
