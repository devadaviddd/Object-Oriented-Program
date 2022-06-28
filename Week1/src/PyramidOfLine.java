//5. Write a program that prompts the user to enter an integer from 1 to 15 and displays a
//   pyramid, as shown in the following sample run:

import java.util.Scanner;

public class PyramidOfLine {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines;
        lines = newobj.nextInt();

        for(int i = 1; i <= lines; i++) {
            for(int space = i; space <= lines; space++) {
                System.out.print("  ");
            }
            for(int num = i; num >= 1; num--) {
                System.out.printf("%2d",num);
            }
            for(int num = 1; num <= i; num++) {
                if(num == 1) {
                    continue;
                } else {
                    System.out.printf("%2d",num);
                }
            }
            System.out.printf("\n");
        }

    }
}
