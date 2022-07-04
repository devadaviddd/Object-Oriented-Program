import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_HashSet {
    // A HashMap object stores an unorder collection of items in "key-value" pairs of object data types
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("England", "Han");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Loop Through a HashMap object
        for(String country: capitalCities.keySet()) {
            System.out.print("key: " + country);
            System.out.println(", value: " + capitalCities.get(country));
        }

        // Each item can be accessed or removed by the "key"
        capitalCities.remove("Germany");
        System.out.println("Capital: " + capitalCities.get("Germany")); // print out null
        System.out.println("size: " + capitalCities.size());
        capitalCities.clear();
        System.out.println(capitalCities);

        System.out.println("Loop the HashMap by key");
        for(String ele : capitalCities.keySet()) {
            System.out.println(ele);
        }

        // HashSet object stores an unorder
        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // because each elements are unique --> cant add this
        System.out.println(cars);

        // HashSet check and remove items
        cars.remove("Ford");

        // HashSet loop through a HashSet object
        for(String car : cars) {
            System.out.println(car);
        }

        /* TreeMap --> order sorted of HashMap*/
        Map<String, String>  hashTree = new LinkedHashMap<String, String>();
    }
}
