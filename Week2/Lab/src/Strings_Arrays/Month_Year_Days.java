package Strings_Arrays;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Month_Year_Days {
    /*static String[] Months = {
        "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC",
    };
    */

    public static boolean leapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            return true;
        } else {
            return false;
        }
    }

    public static void monthYearsDays() {
        Scanner scanner = new Scanner(System.in);
        int year;
        int days;
        String month;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        HashMap<String, Integer> Months = new HashMap<String, Integer>() {{
            put("Jan", 31);
            if(leapYear(year)) {
                put("Feb", 28);
            } else {
                put("Feb", 29);
            }
            put("Mar", 31); put("Apr", 30); put("May", 31); put("Jun", 30); put("July", 31); put("Aug", 31); put("Sep", 30); put("Oct", 31); put("Nov", 30); put("Dec", 31);

        }};
        System.out.print("Enter a month: ");
        month = scanner.next();
        int index = 0;
        for(String key : Months.keySet()) {
            if(month.equals(key)) {
                days = Months.get(key);
                System.out.println(month + " " + year + " has " + days + " days");
                break;
            }
            if(index == Months.size() - 1) {
                System.out.println("Error message");
            }
            index++;
        }

    }

}
