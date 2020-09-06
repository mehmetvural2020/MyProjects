package ShapesWithAbstract;

public class ShapeFactory {
    static Shape getAnShape(String shapeType){
        switch (shapeType) {
            case "Circle" :
                return new Circle("Circle",3);
            case "Rectangle" :
                return new Rectangle("Rectangle",3, 4);
            case "Square" :
                return new Square("Square", 5);
            case "Triangle" :
                return new Triangle("Triangle",3, 3, 4, 5);
        }
    return null;
    }
}
