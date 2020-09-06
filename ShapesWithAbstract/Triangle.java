package ShapesWithAbstract;

public class Triangle extends Shape {
    int base;
    int height;
    int sidea;
    int sideb;

    public Triangle(String shapeType, int base, int height, int sidea, int sideb) {
        super(shapeType);
        this.base = base;
        this.height = height;
        this.sidea = sidea;
        this.sideb = sideb;
    }


    @Override
    public void draw() {
        System.out.println("Triangle is drawing...");
    }

    @Override
    public void erase() {
        System.out.println("Triangle is erasing...");
    }

    @Override
    public double calculateArea() {
        double area = (base * height)/2;
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = base + sidea + sideb;
        return circumference;
    }
}
