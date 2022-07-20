package Lab.Exercise1;


import Lab.Exercise1.*;
import Lab.Exercise1.Recipe;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RecipeComponent c1 = new RecipeComponent(400, new Ingredient("self-rising flour", "g"));
        RecipeComponent c2 = new RecipeComponent(100, new Ingredient("chilled lemonade", "cup"));
        RecipeComponent c3 = new RecipeComponent(30, new Ingredient("thickened cream", "ml"));

        HashSet<RecipeComponent> listOfComponents = new HashSet<RecipeComponent>();
        listOfComponents.add(c1);
        listOfComponents.add(c2);
        listOfComponents.add(c3);


        Recipe recipe = new Recipe("scone", listOfComponents);
        int[] choice = new int[1];
        System.out.println("Choosing 3 separators ways to display recipe object:");
        System.out.println("\t1) Blank Line Separator");
        System.out.println("\t2) Dash Line Separator");
        System.out.println("\t3) Binary Separator");
        System.out.println("Enter from 1 to 3: ");
        choice[0] = scanner.nextInt();
        Separator separator = null;

        switch (choice[0]) {
            case 1:
                separator = new SpaceSeparator();
                break;
            case 2:
                separator = new DashSeparator();
                break;
            case 3:
                separator = new BinarySeparator();
                break;
            default:
                System.out.println("Invalid Input!");
        }

        System.out.println("Choosing 3 attractive ways to display recipe object:");
        System.out.println("\t1) Casual Display");
        System.out.println("\t2) Serious Display");
        System.out.println("\t3) Hacker Display");
        System.out.println("Enter from 1 to 3: ");
        choice[0] = scanner.nextInt();
        RecipeDisplay recipeDisplay = null;

        switch (choice[0]) {
            case 1:
                recipeDisplay = new RecipeCasualDisplay(recipe);
                recipeDisplay.display(separator);
                break;
            case 2:
                recipeDisplay = new RecipeSeriousDisplay(recipe);
                recipeDisplay.display(separator);
                break;
            case 3:
                recipeDisplay = new RecipeHackerDisplay(recipe);
                recipeDisplay.display(separator);
                break;
            default:
                System.out.println("Invalid Input!");
        }

      /*  for(int i = 0; i < 3; i++) {
            recipe.addComponent();
        }
        recipe.display();*/


       /* Ingredient ingredient = Ingredient.createIngredient();
        ingredient.displayIngredient();*/

        System.out.println("Total number of recipes: " + Recipe.getTotalRecipes());
    }
}
