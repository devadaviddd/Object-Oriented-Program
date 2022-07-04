public class Rectangle extends Shape{
    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle() {
        this(0, 0, 0, 0);
    }

    // 3rd Constructor
    public Rectangle(int x, int y,  int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
