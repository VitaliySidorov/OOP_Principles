package HW_2;

public class Shape {
    private int sides;
    private static double width;
    private static double height;

    public Shape(int sides, double width, double height) {
        this.sides = sides;
        this.width = width;
        this.height = height;
    }

    Shape() {
        this(4, 10.0, 26.0);
    }

 
    void Show() {
        System.out.println("Фигура: " + getName());
        System.out.println("Количество сторон: " + getSides());
        System.out.println("Линейные размеры: " + getWidth() + " x " + getHeight());
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
        String line = "";
        for (int index = 1; index <= 30; index++) {
            line +="*";
        }
        System.out.println(line);
    }

    private int getSides() {
        return sides;
    }

    String getName() {
        return getSides()+"-угольник";
    }

    public double getWidth() {
    return width;
    }

    public void setWidth(int width) {
    this.width = width;
    }

    public double getHeight() {
    return height;
    }

    public void setHeight(int height) {
    this.height = height;
    }

    double calculateArea() {
    return width * height;
    }

    double calculatePerimeter() {
    return 2 * (width + height);
    }

    static class Rectangle extends Shape implements IShapes {

        Rectangle(int sides, int width, int height) {
            super(4, width, height);
        }

        public String getName() {
            return "Прямоугольник";
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }

    }

    static class Circle extends Shape implements IShapes {

        Circle(int width) {
            super(1, width, width);
        }

        public String getName() {
            return "Круг";
        }

        @Override
        public double calculateArea() {
            return PI * (double) Math.pow(height, 2);
        }

        @Override
        public double calculatePerimeter() {
            return 2 * PI * (height / 2);
        }

    }

    static class Triangle extends Shape implements IShapes {

        Triangle(int sides, int width, int height) {
            super(3, width, height);
        }

        public String getName() {
            return "Треугольник";
        }

        @Override
        public double calculateArea() {
            return width * height / 2;
        }

        @Override
        public double calculatePerimeter() {
            return Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) * 2 + height;
        }

    }
}
