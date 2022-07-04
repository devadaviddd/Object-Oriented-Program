public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {  // Default access modifier
        System.out.println("[" + x + ", " + y + "]");
    }
}
