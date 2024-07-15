public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();

        Shape shape2 = new Shape("Green", true);
        System.out.println("Shape  - Color: " + shape2.getColor());
        System.out.println("Shape  - Filled: " + shape2.isFilled());
        System.out.println("Shape  - String representation: " + shape2.toString());

System.out.println("-------------------------------------------------------------------------------");

        Rectangle rectangle1 = new Rectangle();

        Rectangle rectangle2 = new Rectangle("Green", true, 5.0, 5.0);
        System.out.println("Rectangle  - Width: " + rectangle2.getWidth());
        System.out.println("Rectangle  - Length: " + rectangle2.getLength());
        System.out.println("Rectangle  - Area: " + rectangle2.getArea());
        System.out.println("Rectangle  - Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Rectangle  - Color: " + rectangle2.getColor());
        System.out.println("Rectangle  - Filled: " + rectangle2.isFilled());
        System.out.println("Rectangle  - String representation: " + rectangle2.toString());

        System.out.println("-------------------------------------------------------------------------------");

        Circle circle1 = new Circle(4.5); // Create a circle object with a specified radius
        System.out.println("Circle - Radius: " + circle1.getRadius());
        System.out.println("Circle  - Area: " + circle1.getArea());
        System.out.println("Circle  - Perimeter: " + circle1.getPerimeter());
        System.out.println("Circle  - Color: " + circle1.getColor());
        System.out.println("Circle  - Filled: " + circle1.isFilled());
        System.out.println("Circle  - String representation: " + circle1.toString());
        System.out.println();

        Circle circle3 = new Circle("black", true, 2.0);
        System.out.println("Circle 3 - Radius: " + circle3.getRadius());
        System.out.println("Circle 3 - Area: " + circle3.getArea());
        System.out.println("Circle 3 - Perimeter: " + circle3.getPerimeter());
        System.out.println("Circle 3 - Color: " + circle3.getColor());
        System.out.println("Circle 3 - Filled: " + circle3.isFilled());
        System.out.println("Circle 3 - String representation: " + circle3.toString());

        System.out.println("-------------------------------------------------------------------------------");
        Square square1 = new Square();


        Square square2 = new Square(5.0);
        System.out.println("Square - Side: " + square2.getSide());
        System.out.println("Square - Area: " + square2.getArea());
        System.out.println("Square - Perimeter: " + square2.getPerimeter());
        System.out.println("Square - Color: " + square2.getColor());
        System.out.println("Square - Filled: " + square2.isFilled());
        System.out.println("Square - String representation: " + square2.toString());
        System.out.println();

        Square square3 = new Square("Green", true, 4.0, 4.0);
        System.out.println("Square - Side: " + square3.getSide());
        System.out.println("Square - Area: " + square3.getArea());
        System.out.println("Square - Perimeter: " + square3.getPerimeter());
        System.out.println("Square - Color: " + square3.getColor());
        System.out.println("Square - Filled: " + square3.isFilled());
        System.out.println("Square - String representation: " + square3.toString());





    }
}