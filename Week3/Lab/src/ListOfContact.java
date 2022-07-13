import java.util.ArrayList;
import java.util.List;

public class ListOfContact {
    private String owner;
    ArrayList<Contact> contactList;

    public ListOfContact(String owner, ArrayList<Contact> contactList) {
        this.owner = owner;
        this.contactList = contactList;
    }

    public ListOfContact(String owner) {
        this.owner = owner;
    }

    public void readList() {
        System.out.println(contactList);
    }

    public boolean update(Contact contact) {
        for(Contact each : contactList) {
            if(each.getEmail().equals(contact.getEmail())) {
                System.out.println("Cannot Update");
                return false;
            }
        }
        contactList.add(contact);
        System.out.println("Update Successfully!");
        return true;
    }

    public boolean delete(int i) {
        if(i >= 0 && i < contactList.size()) {
            contactList.remove(i);
            System.out.println("Delete Successfully!");
            return true;
        }
        System.out.println("Cannot Delete!");
        return false;
    }

    public boolean search(String str) {
        for(Contact each : contactList) {
            if(each.getName().equals(str) || each.getEmail().equals(str) || each.getAddress().equals(str) || each.getPhoneNumber().equals(str)) {
                System.out.println("Search Successfully!");
                System.out.println(each);
                return true;
            }
        }
        System.out.println("The contact is not exist!");
        return false;
    }

    public boolean displayWithOneField(String givenField) {
        for(Contact each : contactList) {
            if(givenField.equalsIgnoreCase("name")) {
                System.out.println(each.getName());
            } else if(givenField.equalsIgnoreCase("phone number")) {
                System.out.println(each.getPhoneNumber());
            } else if(givenField.equalsIgnoreCase("email")) {
                System.out.println(each.getEmail());
            } else if(givenField.equalsIgnoreCase("address")) {
                System.out.println(each.getAddress());
            } else {
                System.out.println("Invalid Syntax");
                return false;
            }
        }
        return true;
    }
}
