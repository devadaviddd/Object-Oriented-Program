package Strings_Arrays;

import java.util.Collections;
import java.util.Scanner;
/* Write a method that takes a string and returns its reverse. For example, if the given
string is "Good day" then the method returns "yad dooG".*/
public class Reserve_String {
    public static String reserveString(String str) {
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // extracts each character
            revStr = ch + revStr;
        }
        return  revStr;
    }
}
