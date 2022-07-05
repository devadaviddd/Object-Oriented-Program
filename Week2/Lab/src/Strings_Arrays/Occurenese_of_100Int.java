package Strings_Arrays;

import java.util.*;

public class Occurenese_of_100Int {
    void occurences(String str) {
        String[] strArray = null;
        strArray = str.split(" ");

        ArrayList<Integer> arrNum = new ArrayList<Integer>();

        for(String numStr : strArray) {
            if(Integer.parseInt(numStr) >= 1 && Integer.parseInt(numStr) <= 100) {
                arrNum.add(Integer.parseInt(numStr));
            }
        }
        Collections.sort(arrNum);

        int[] arrCount = new int[arrNum.size()];
        System.out.println(Arrays.toString(arrCount));

        for(Integer occur : arrNum) {
            arrCount[arrNum.indexOf(occur)] += 1;
        }
        System.out.println(Arrays.toString(arrCount));

        int index = 0;
        for(Integer each : arrNum) {
            if(arrCount[index] != 0) {
                System.out.println(each + " occurs " + arrCount[index]+
                        ((arrCount[index] > 1) ? " times" : " time"));
            }
            index++;
        }

    }
}
