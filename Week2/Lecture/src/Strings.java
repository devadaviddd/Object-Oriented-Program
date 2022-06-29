public class Strings {
    public static void main(String[] args) {
        //Create Strings
        String greeting = new String("Hello"); //dynamic
        String hello = "Hello";

        //String length
        System.out.println(greeting.length());

        //String comparison
        System.out.println(greeting.equals(hello));

        //String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //Substring
        String txt = "RMIT University Vietnam";
        System.out.println(txt.substring(0, 4));

        //Searching in a String
        System.out.println(txt.indexOf("Vj"));

        //Conversion between strings and numbers
        String intString = "123";
        int intValue = Integer.parseInt(intString);
        String doubleString = "3.14159";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(intValue + ", " + doubleValue);

        //String is immutable
        hello = "323";
        System.out.println(hello);



    }
}
