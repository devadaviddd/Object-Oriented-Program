/*3. Design a class named QuadraticEquation for a quadratic equation ax2 + bx + c = 0. The
class contains:
• Private attributes a, b, c that represent three coefficients.
• A constructor with the arguments for a, b, and c.
• Three get methods for a, b, c.
• A method getDiscriminant() that return the discriminant b
2 – 4ac.
• Methods getRoot1() and getRoot2() for returning two roots of the equation
These methods are useful only if the discriminant is nonnegative. Let these
methods return 0 if the discriminant is negative.
Draw a class diagram for this class and then implement the class. Write a test program
that prompts the user to enter values for a, b then displays the result based on the
2
RMIT Classification: Trusted
discriminant. If the discriminant is positive, display two roots. If the discriminant is 0,
display one root. Otherwise, display "The equation has no roots."*/

public class QuadraticEquation {
    /* Three coefficients field*/
    private double a;
    private double b;
    private  double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public double getRoot1() {
        if(this.getDiscriminant() >= 0) {
            double root1 = (-b + Math.sqrt(this.getDiscriminant()))/(2 * a);
            return root1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if(this.getDiscriminant() >= 0) {
            double root2= (-b - Math.sqrt(this.getDiscriminant()))/(2 * a);
            return root2;
        } else {
            return 0;
        }
    }
}
