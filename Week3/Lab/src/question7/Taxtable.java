package question7;

import question7.Tax;

import java.util.Formatter;

public class Taxtable {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        System.out.println("2021 tax tables for taxable income from $9,000 to $690,000");
        System.out.println("---------------------------------------------------------------------");
        fmt.format("%12s %12s %15s %12s %12s\n", "Income", "Single", "Married Joint", "Married", "Head of");
        for(double income = 9000; income <= 690000; income+=10000) {
            fmt.format("%12s %12s %15s %12s %12s\n", income, Tax.single(income), Tax.marriedJoint(income), Tax.married(income), Tax.headOf(income));
            fmt.format("---------------------------------------------------------------------\n");
        }
        System.out.println(fmt);

    }
}
