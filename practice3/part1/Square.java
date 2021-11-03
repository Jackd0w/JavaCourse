package part1;

public class Square extends Rectangle {
    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public Square() {

    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return super.toString() + " square";
    }
}
