package part1;

public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double value) {
        radius = value;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return super.toString() + " circle";
    }
}
