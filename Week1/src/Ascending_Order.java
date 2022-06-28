//1. Write a program that get three integers from the user and then prints them out in ascending order.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Order {
    //public private package protected
    static Scanner myObj = new Scanner(System.in);
    public static void sol() {

        //int[] intArr = new int[3];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++) {
            System.out.print("Enter num" + i + ": ");
            arr.add(myObj.nextInt());
        }

        Collections.sort(arr); //Collections.reverseOrder() --> descending
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.print("\n");

        //forEach
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void student() {
        int num1;
        int num2;
        int num3;

        System.out.print("Enter num1: ");
        num1 = myObj.nextInt();
        System.out.print("Enter num2: ");
        num2 = myObj.nextInt();
        System.out.print("Enter num3: ");
        num3 = myObj.nextInt();

        int[] arr = {num1, num2, num3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length - 1; j++) {
                if(arr[i] > arr[j + 1]) {
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



    public static void main(String[] args) {
        Ascending_Order tu1 = new Ascending_Order();
        tu1.sol();


    }
}
