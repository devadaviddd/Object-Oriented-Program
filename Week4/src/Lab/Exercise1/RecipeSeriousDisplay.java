package Lab.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecipeSeriousDisplay extends RecipeDisplay{

    public RecipeSeriousDisplay() {
    }

    public RecipeSeriousDisplay(Recipe recipe) {
        super(recipe);
    }

    @Override
    public void display(Separator separator) {
        System.out.println("Serious Display: ");
        List<RecipeComponent> list = new ArrayList<RecipeComponent>(super.getRecipe().getArrOfComponent());
        Collections.sort(list, new RecipeComponentByAmount());
        for(RecipeComponent rc: list) {
            System.out.println(rc.toString());
            separator.display();
        }
    }
}
