//1. Write a program that get three integers from the user and then prints them out in ascending order.

import java.util.Scanner;

public class Ascending_Order {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = myObj.nextInt();
        System.out.print("Enter num2: ");
        num2 = myObj.nextInt();
        System.out.print("Enter num3: ");
        num3 = myObj.nextInt();

        int[] arr = {num1, num2, num3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length - 1; j++) {
                if(arr[i] < arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
