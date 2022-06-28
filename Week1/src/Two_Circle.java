import java.util.Scanner;
import java.lang.*;
// Write a program that prompts the user to enter the center coordinates and radiuses of
// two circles and determines whether the second circle is inside the first or overlaps with
// the first, as shown in the below Figure.
// eHint: circle2 is inside circle1 if the distance between the two centers <= |r1 - r2| and
// circle2 overlaps circle1 if the distance between the two centers <= r1 + r2
// Test your program to cover all cases.
public class Two_Circle {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        double circle1X;
        double circle1Y;
        double radius1;

        double circle2X;
        double circle2Y;
        double radius2;

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        circle1X = myobj.nextDouble();
        circle1Y = myobj.nextDouble();
        radius1 = myobj.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        circle2X = myobj.nextDouble();
        circle2Y = myobj.nextDouble();
        radius2 = myobj.nextDouble();

        double distance = Math.sqrt(Math.pow((circle2X - circle1X), 2) + Math.pow((circle2Y - circle1Y), 2));

        if(distance <= Math.abs(radius1 - radius2)) {
            System.out.println("circle2 is inside circle1");
        } else if(distance <= radius1 + radius2) {
            System.out.println("circle2 is overlap circle");
        }

    }
}
