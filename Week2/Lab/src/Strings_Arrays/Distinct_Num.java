package Strings_Arrays;

import java.util.HashSet;

public class Distinct_Num {
    boolean distinctNum(String str) {
        String[] strArray = null;
        strArray = str.split(" ");

        // Convert String Arr to Int Arr
        HashSet<Integer> setNums = new HashSet<Integer>();
        for(String numStr : strArray) {
            setNums.add(Integer.parseInt(numStr));
        }

        for(Integer num : setNums) {
            if(num < 1 || num > 100) {
                System.out.println("Num is not between 1 and 100");
                return false;
            }
        }

        System.out.println("The number of distinct number is: " + setNums.size());

        System.out.print("The distinct numbers are: ");
        for(Integer num : setNums) {
            System.out.print(num + " ");
        }
        return true;
    }
}
