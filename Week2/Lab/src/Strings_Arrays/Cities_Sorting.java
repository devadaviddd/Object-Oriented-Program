package Strings_Arrays;

import java.util.*;

/*Write a program that prompts the user to enter three cities and display them in
ascending order. Sample run:*/

public class Cities_Sorting {
    void citiesSorting() {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> cities = new TreeSet<>();
        System.out.print("Enter the first city: ");
        cities.add(scanner.nextLine());
        System.out.print("Enter the second city: ");
        cities.add(scanner.nextLine());
        System.out.print("Enter the third city: ");
        cities.add(scanner.nextLine());

        System.out.print("Cities in alphabetical order: ");
        for(String city : cities) {
            System.out.print(city + " ");
        }



    }
}
