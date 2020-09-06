package ShapesWithAbstract;

public class Circle extends Shape {
    double radius;

    public Circle(String shapeType, double radius) {
        super(shapeType);
        this.radius = radius;
    }

    //    public Circle(double radius) {
//        this.radius = radius;
//    }

    @Override
    public void draw() {
        System.out.println("Circle is drawing...");
    }

    @Override
    public void erase() {
        System.out.println("Circle is erasing...");
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
