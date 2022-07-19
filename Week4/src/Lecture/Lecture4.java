package Lecture;

public class Lecture4 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Lecture4 obj1 = new Lecture4();
        obj1.setName("Minh");
        System.out.println(obj1);
    }

    @Override
    public String toString() {
        return "Lecture4{" +
                "name='" + name + '\'' +
                '}';
    }
}





