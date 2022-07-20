package Lab.Exercise1;

public class RecipeCasualDisplay extends RecipeDisplay{

    public RecipeCasualDisplay() {
    }

    public RecipeCasualDisplay(Recipe recipe) {
        super(recipe);
    }

    @Override
    public void display(Separator separator) {
        System.out.println("Casual Display: ");
        for(RecipeComponent rc : super.getRecipe().getArrOfComponent()) {
            System.out.println(rc);
            separator.display();
        }
    }
}
