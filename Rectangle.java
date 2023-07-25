public class Rectangle {
    private static int count = 0;
    private int id;
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.id = ++count;
        this.width = width;
        this.height = height;
    }

    Rectangle() {
        this(10.0, 26.0);
    }

    public int getId() {
        return id;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return ("Rectangle " + id +
                " {Width = " + width +
                ", Height = " + height +
                "}" + 
                "\tArea = " + calculateArea() + 
                "\tPerimeter = " + calculatePerimeter() + "\n");
    }

}
