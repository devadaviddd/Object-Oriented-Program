package Lab.Exercise1;

import java.util.Random;
import java.util.Scanner;

public class Ingredient {
    private String name;
    private String unit;

    private String comment;

    public Ingredient() {
    }

    public Ingredient(String name, String unit, String comment) {
        this.name = name;
        this.unit = unit;
        this.comment = comment;
    }

    public Ingredient(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public boolean setUnit(String unit) {
        String[] availableUnits = {"teaspoon", "g", "ml"};
        boolean matched = false;
        for(String units : availableUnits) {
            if(units.equals(unit)) {
                matched = true;
                this.unit = unit;
                return true;
            }
        }
        System.out.println("Wrong Unit Input!");
        return  false;
    }

    public static Ingredient createIngredient() {
        System.out.println("Enter the ingredient name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the ingredient unit: ");
        String unit = scanner.nextLine();
        System.out.println("Enter the ingredient comment: ");
        String comment = scanner.nextLine();
        if(comment.equals("")) {
            comment = "No comment";
        }
        return new Ingredient(name, unit, comment);
    }

    public void displayIngredient() {
        System.out.printf("Ingredient name is: %s. The measurement unit is: %s. The comment is: %s.\n", this.name, this.unit, this.comment);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
