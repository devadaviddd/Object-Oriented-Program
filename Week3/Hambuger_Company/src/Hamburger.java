public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private Addition add;

    public Hamburger(String name, String breadRollType) {
        this.meat = name;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String meat, double price) {
        this.meat = meat;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType +
                " roll with " + this.meat + ", " + "price is " + this.price);
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + "roll with " + meat + ", " +
                "price is " + price);

    }

    public void addHamburgerAddition(Addition addition) {
        this.add = addition;
        this.price += add.getAdditionPrice();
        System.out.println("Added " + add.getAdditionName() + " for an extra " + add.getAdditionPrice());
    }

    public double itemizeHamburger() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public Addition getAdd() {
        return add;
    }

    public void setAdd(Addition add) {
        this.add = add;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
