package Strings_Arrays;

import java.util.*;

/*Write a program that prompts the user to enter three cities and display them in
ascending order. Sample run:*/

public class Cities_Sorting {
    public static void citiesSorting() {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> cities = new HashSet<String>();
        System.out.print("Enter the first city: ");
        cities.add(scanner.nextLine());
        System.out.print("Enter the second city: ");
        cities.add(scanner.nextLine());
        System.out.print("Enter the third city: ");
        cities.add(scanner.nextLine());

        // Convert to a list and sort
        List<String> cityList = new ArrayList<>(cities);
        Collections.sort(cityList);
        System.out.print("Cities in alphabetical order: ");
        for(String city : cityList) {
            System.out.print(city + " ");
        }

    }
}
