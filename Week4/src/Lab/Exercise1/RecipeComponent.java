package Lab.Exercise1;

import java.util.Scanner;

public class RecipeComponent {
    private float amount;
    private Ingredient ingredient;

    public RecipeComponent() {
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public RecipeComponent(float amount, Ingredient ingredient) {
        this.amount = amount;
        this.ingredient = ingredient;
    }

    public static RecipeComponent addRecipeComponent() {
        Scanner scanner = new Scanner(System.in);
        Ingredient ingredient = Ingredient.createIngredient();
        System.out.println("Enter the amount: ");
        float amount = scanner.nextFloat();

        return new RecipeComponent(amount, ingredient);
    }

    @Override
    public String toString() {
        return "RecipeComponent{" +
                "amount=" + amount +
                ", ingredient=" + ingredient +
                '}';
    }
}

