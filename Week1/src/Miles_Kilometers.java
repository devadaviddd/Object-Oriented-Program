//4. Write a program that uses a suitable loop to display a conversion table nicely as the one
//below, knowing that 1 mile is 1.609 kilometers. Hint: use System.out.printf().
public class Miles_Kilometers {
    public static void main(String[] args) {
        int newInt = 20;
        for(int i = 0; i < 11; i++) {
            if(i == 0) {
                System.out.println("Miles   Kilometers   |   Kilometers   Miles");
            } else {
                System.out.printf(" %2d ", i);
                System.out.printf("    %.2f    |", (float)i * 1.609);
                System.out.printf("    %2d    ", newInt);
                System.out.printf("    %.2f    ", (float) newInt / 1.609);
                newInt = newInt + 5;
                System.out.printf("\n");
            }
        }
    }
}
