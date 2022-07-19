package Lab.Exercise1;

import java.util.Comparator;

public class RecipeComponentByAmount implements Comparator<RecipeComponent> {
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2) {
        if(o1.getAmount() > o2.getAmount()) {
            return 1;
        } else if(o1.getAmount() < o2.getAmount()) {
            return -1;
        }
        return 0;
    }


}
