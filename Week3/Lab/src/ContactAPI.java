import java.util.ArrayList;

public class ContactAPI {
    public static void main(String[] args) {
        Contact con1 = new Contact("Khang", "093123", "tuongkhangnguyen@gmail.com", "District 7");
        Contact con2 = new Contact("Loan", "092334", "tuongloandnguyen@gmail.com", "District 8");
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(con1);
        contacts.add(con2);
        ListOfContact list1 = new ListOfContact("Khang", contacts);
        list1.readList();
        list1.update(new Contact("Duy", "092331", "tuongduynguyen@gmail.com", "District 6"));
        list1.readList();
        list1.delete(2);
        list1.readList();
        list1.search("Khang");
        list1.displayWithOneField("email");

    }
}
