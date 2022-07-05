import java.util.concurrent.ThreadLocalRandom;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 10, "White");
    }

    @Override
    public void addHamburgerAddition(Addition addition) {
        System.out.println("Cannot add additional items to a deluxe burger");
        double maxAtCurrent = 19.10 - super.getPrice();
        double priceOfChips = ThreadLocalRandom.current().nextDouble(0, maxAtCurrent);
        double priceOfChipsAndFix = priceOfChips + super.getPrice();
        super.addHamburgerAddition(new Addition("Chips", priceOfChips));

        double priceOfDrinks = 19.10 - priceOfChipsAndFix;
        super.addHamburgerAddition(new Addition("Drink", priceOfDrinks));

    }
}
