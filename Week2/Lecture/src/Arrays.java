import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        int[] nums; // declare an array
        nums = new int[4]; // specify array length(size)
        int[] numsArr = {5, 10, 15, 20};
        String[] cars = {"Honda", "Toyota", "Ford", "BMW"};
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //ArrayList
        ArrayList<String> arrayListCar = new ArrayList<String>();
        arrayListCar.add("Audi");
        arrayListCar.add("BMW");
        arrayListCar.add("Ford");
        arrayListCar.set(2, "Toyota"); // assign new value
        arrayListCar.remove(0); // remove element by putting index
        System.out.println(arrayListCar);
        for(int i = 0; i < arrayListCar.size(); i++) {
            System.out.println(arrayListCar.get(i));
        }

        //Sorting Algorithm
        Collections.sort(arrayListCar);
        for (String car : arrayListCar) {
            System.out.println(car);
        }

    }
}
