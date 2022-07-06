public class HealthyBurger extends Hamburger {
    private Addition healthyAdd;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "White");
    }



    @Override
    public void addHamburgerAddition(Addition addition) {
        super.addHamburgerAddition(addition);
    }
}
