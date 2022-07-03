package Strings_Arrays;

import java.util.Arrays;
import java.util.Random;

/*Write a program that generates 100 random integers between 0 and 9 then displays the
count for each number. Hint: use the method Math.random().*/
public class Count_100_Integers {
    public static void count() {
        int minimum = 0;
        int maximum = 10;
        int[] arrNum = new int[100];
        for(int i = 0; i < arrNum.length; i++) {
            int randomNum = minimum + (int)(Math.random() * maximum);
            arrNum[i] = randomNum;
        }

        int[] arrCount = new int[100];
        int sum = 0;
        for(int i = 0; i < arrCount.length; i++) {
            arrCount[arrNum[i]] += 1;
        }

        int[] arrDisplay = new int[10];
        for(int i = 0; i < arrDisplay.length; i++) {
            arrDisplay[i] = arrCount[i];
        }
        int index = 0;
        for(int each : arrDisplay) {
            System.out.println(index + " occurs " + each + ((each > 1)? " times": " time"));
            index++;
        }

        System.out.println(Arrays.toString(arrNum));
        System.out.println(Arrays.toString(arrCount));
        System.out.println(Arrays.toString(arrDisplay));
    }
}
