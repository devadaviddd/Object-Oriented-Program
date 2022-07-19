package Lab.Exercise1;

import java.util.Comparator;

public class RecipeComponentByDigits implements Comparator<RecipeComponent> {
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2) {
        String str1 = String.valueOf(o1.getAmount());
        String str2 = String.valueOf(o2.getAmount());
        int firstDigit1 = Integer.parseInt(str1.substring(0,1));
        int firstDigit2 =  Integer.parseInt(str2.substring(0,1));

        if(firstDigit1 > firstDigit2) {
            return 1;
        } else if(firstDigit1 < firstDigit2){
            return -1;
        }
        return 0;
    }
}
