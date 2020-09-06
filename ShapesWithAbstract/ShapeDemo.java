package ShapesWithAbstract;
//  Shapes Area And Circumferences Calculation with Abstract...
public class ShapeDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("\nYou can see 4 Shapes information as below : ");
        Shape shape = shapeFactory.getAnShape("Triangle");
        shapesToDo(shape);

        Shape shape1 = shapeFactory.getAnShape("Circle");
        shapesToDo(shape1);

        Shape shape2 = shapeFactory.getAnShape("Square");
        shapesToDo(shape2);

        Shape shape3 = shapeFactory.getAnShape("Rectangle");
        shapesToDo(shape3);

//        Shape shape4 = shapeFactory.getAnShape("triangle");
//        shapesToDo(shape4);
    }

    public static void shapesToDo(Shape shape) {
        shape.draw();
        shape.erase();
        System.out.println("Area of " + shape.shapeType + " is " + shape.calculateArea());
        System.out.println("Circumference of " + shape.shapeType + " is " + shape.calculateCircumference() + "\n");
    }
}
