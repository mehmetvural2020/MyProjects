package ShapesWithAbstract;

public class Square extends Shape {
    int edge;

    public Square(String shapeType, int edge) {
        super(shapeType);
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Square is drawing...");
    }

    @Override
    public void erase() {
        System.out.println("Square is erasing...");
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(edge,2);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 4 * edge;
        return circumference;
    }
}
