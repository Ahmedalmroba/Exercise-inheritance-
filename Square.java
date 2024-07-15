public class Square extends Rectangle {


    public Square() {

    }
    public  Square(double side) {

    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }


    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        return "Square[side=" + getWidth() + ", color=" + getColor() + ", filled=" + isFilled()+"]";
}
}



