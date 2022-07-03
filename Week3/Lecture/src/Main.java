public class Main {

    public static void main(String[] args) {
        /*Classes vs Objects*/
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 1; p1.y = 2;
        p2.x = 3; p2.y = 4;
        System.out.println("[" + p1.x + ", " + p1.y + "]");
        System.out.println("[" + p2.x + ", " + p2.y + "]");

        p1.showPoint();
        p2.showPoint();



    }
}