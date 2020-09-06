package ShapesWithAbstract;

public abstract class Shape {
    String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public abstract void draw();
    public abstract void erase();
    public abstract double calculateArea();
    public abstract double calculateCircumference();

}
