package Strings_Arrays;

import java.util.Arrays;

/*Write a program that determines if a list is already sorted in increasing order. The
program should prompt the user to enter a list and displays whether the list is sorted in
ascending order or not. Note that the first number in the input indicates the number of
the elements in the list. The program exits when the first number is 0.*/
public class Sorted_List {
    boolean isSortedList(String str) {
        // Convert str to String Arr
        String[] strArray = null;
        strArray = str.split(" ");

        // Convert String Arr to Int Arr
        int[] list = new int[Integer.parseInt(strArray[0])];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(strArray[i + 1]);
        }

        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
