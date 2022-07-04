public class Product {
    public String name;
    public double price;

    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void productInfo(){
        System.out.println("name of product: " + name + ". Price = " + price +
            ". Quantity = "  + quantity);

    }
}
