package Strings_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        Month_Year_Days ex1 = new Month_Year_Days();
        ex1.monthYearsDays();

        Cities_Sorting ex2 = new Cities_Sorting();
        ex2.citiesSorting();

        Reserve_String ex3 = new Reserve_String();
        System.out.print("Enter a String: ");
        str = scanner.nextLine();
        System.out.println("Reserve String of " + str +  " is: " + ex3.reserveString(str));

        Palindrome ex4 = new Palindrome();
        if(ex4.isPalindrome(str)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " isn't Palindrome");
        }


    }
}