package Strings_Arrays;

import java.util.*;

public class Occurenese_of_100Int {
    public static void occurences(String str) {
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

        for(Integer occur : arrNum) {
            arrCount[arrNum.indexOf(occur)] += 1;
        }

        /*Convert Array to ArrayList*/
        ArrayList<Integer> listCount = new ArrayList<Integer>();
        for(Integer ele : arrCount) {
            if(ele != 0) {
                listCount.add(ele);
            }
        }

        HashSet<Integer> setNum = new HashSet<Integer>();
        for(Integer num : arrNum) {
            setNum.add(num);
        }
        ArrayList<Integer> sortedSet = new ArrayList<Integer>(setNum);
        Collections.sort(sortedSet);


        System.out.println(arrNum);
        System.out.println(sortedSet);
        System.out.println(Arrays.toString(arrCount));
        System.out.println(listCount);

        int index = 0;
        for(Integer each : sortedSet) {
            System.out.println(each + " occurs " + listCount.get(index)+
                    ((listCount.get(index) > 1) ? " times" : " time"));
            index++;
        }

    }
}
