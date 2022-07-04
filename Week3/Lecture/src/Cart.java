import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Cart {
    private String customerId;
    private String customerName;
    private List<Product> bill = new ArrayList<Product>();


    public boolean addToCart(Product product) {
        for(Product item : bill) {
            if(item.name.equals(product.name)) {
                item.quantity += product.quantity;
                return true;
            }
        }
        bill.add(product);
        return true;
    }

    public void setBill(List<Product> bill) {
        this.bill = bill;
    }

    public List<Product> getBill() {
        /*System.out.println(Arrays.toString(bill.toArray()));*/
        for(Product pro : bill) {
            System.out.println(pro.name + " " + pro.price + " " + pro.quantity);
        }
        return bill;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}


