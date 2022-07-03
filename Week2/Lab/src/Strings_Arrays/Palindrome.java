package Strings_Arrays;

/* palindrome is a string that reads the same backward as forward when ignoring
punctuations, blanks and case difference. For example, "madam", "Hannah", "Step on
no pets", "Was it a car or a cat I saw?", "A man, a plan, a canal, Panama!" are all
palindromes. Write a method that checks if a given string is a palindrome or not. Hint:
use the method in the last exercise*/

public class Palindrome {
    boolean isPalindrome(String str) {
        String filter = str.toLowerCase().replaceAll("\\s", "").replaceAll(
                "\\p{P}", ""
        );
        Reserve_String ex3 = new Reserve_String();
        if(filter.equals(ex3.reserveString(filter))) {
            return true;
        } else {
            return  false;
        }
    }
}
