package Lab.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecipeHackerDisplay extends RecipeDisplay{
    public RecipeHackerDisplay() {
    }

    public RecipeHackerDisplay(Recipe recipe) {
        super(recipe);
    }

    @Override
    public void display() {
        System.out.println("Hacker Display: ");
        List<RecipeComponent> list = new ArrayList<RecipeComponent>(super.getRecipe().getArrOfComponent());
        Collections.sort(list, new RecipeComponentByDigits());
        for(RecipeComponent rc : list) {
            System.out.println(rc.toString());
            System.out.println("------");
        }

    }
}
