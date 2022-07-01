package Strings_Arrays;

/*Write a program that reads an unspecified number of scores in one input and
determines how many scores are above or equal to the average and how many scores
are below the average.*/
public class Average_Score {
    public static void aboveBelowAverage(String str) {
        String[] strArr = null;
        strArr = str.split(" ");
        double[] scores = new double[strArr.length];
        double Avg;
        double sum = 0;

        for(int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(strArr[i]);
        }

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        Avg = sum / scores.length;
        System.out.println("Average Score = " + Avg);

        System.out.println("Above or equal: ");
        for(double aboveOrEqual : scores) {
            if(aboveOrEqual >= Avg) {
                System.out.print(aboveOrEqual + " ");
            }
        }
        System.out.print("\n");

        System.out.println("Below: ");
        for(double below : scores) {
            if(below < Avg) {
                System.out.print(below + " ");
            }
        }
    }
}
