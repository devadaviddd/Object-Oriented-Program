public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56,
                "White");
        hamburger.addHamburgerAddition(new Addition("Tomato", 0.27));
        hamburger.addHamburgerAddition(new Addition("Lettuce", 0.75));
        hamburger.addHamburgerAddition(new Addition("Cheese", 1.13));
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition(new Addition("Eggs", 5.43));
        healthyBurger.addHamburgerAddition(new Addition("Lentils", 3.41));
        System.out.println("Total HealthyBurger price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition(new Addition("Should not do this", 3));
        System.out.println("Total Deluxe price is " + deluxeBurger.itemizeHamburger());

    }


}