package ShapesWithAbstract;

public class Rectangle extends Shape {
    int width;
    int length;

    public Rectangle(String shapeType, int width, int length) {
        super(shapeType);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing...");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle is erasing...");
    }

    @Override
    public double calculateArea() {
        double area = width * length;
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 2 * (width + length);
        return circumference;
    }
}
