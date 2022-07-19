package Lab.Exercise1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Recipe {
    private String name;
    private HashSet<RecipeComponent> arrOfComponent;
    private static int totalRecipes = 0;

    public Recipe(String name, HashSet<RecipeComponent> arrOfComponent) {
        this.name = name;
        this.arrOfComponent = arrOfComponent;
    }

    public static int getTotalRecipes() {
        return totalRecipes;
    }

    public void setArrOfComponent(HashSet<RecipeComponent> arrOfComponent) {
        this.arrOfComponent = arrOfComponent;
    }

    public HashSet<RecipeComponent> getArrOfComponent() {
        return arrOfComponent;
    }

    public Recipe(String name) {
        this.name = name;
        this.arrOfComponent = new HashSet<RecipeComponent>();
        totalRecipes++;
    }

    public void addComponent() {
        System.out.println("Adding a new component");
        RecipeComponent r1 = RecipeComponent.addRecipeComponent();
        arrOfComponent.add(r1);
        System.out.println("Adding successfully!");
    }

    public void display() {
        System.out.println(name + " (Recipe)");
        for(RecipeComponent rc : arrOfComponent) {
            System.out.println(rc);
            System.out.println("--------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
