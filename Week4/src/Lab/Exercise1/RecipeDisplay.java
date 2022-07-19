package Lab.Exercise1;

public abstract  class RecipeDisplay {
    private Recipe recipe;

    public RecipeDisplay() {
    }

    public RecipeDisplay(Recipe recipe) {
        this.recipe = recipe;
    }

    public void display() {
        recipe.display();
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
