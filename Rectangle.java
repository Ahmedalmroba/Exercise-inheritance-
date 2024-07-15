public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled,double width, double length) {
        super(color, filled);
        this.length=length;
        this.width=width;
    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", color=" + getColor() + ", filled=" + isFilled()+"]";
}
}



