import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Classes vs Objects*/
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println("[" + p1.x + ", " + p1.y + "]");
        System.out.println("[" + p2.x + ", " + p2.y + "]");

        p1.showPoint();
        p2.showPoint();

        /* Encapsulation: Encapsulation is to make sure that the "sensitive" data of a
class is hidden from other classes*/
        /* Attributes: private
        *         methods: get
        *                  set*/

        Person person  = new Person();
        person.setName("John"); /* set method to set the value --> access*/
        System.out.println(person.getName()); /* get method to get the value*/

        /* Class Relationships*/
        /* 1. Dependency */
        Product pro1 = new Product("iPhone", 34.5, 1);
        Product pro2 = new Product("iPhone", 34.5, 1);
        Cart cart1 = new Cart();

        cart1.setCustomerId("s3921283");
        cart1.setCustomerName("Khang");
        List<Product> bill = new ArrayList<Product>();
        cart1.setBill(bill);
        cart1.addToCart(pro1);
        cart1.addToCart(pro2);

        cart1.getBill();

        /* Association */




    }
}