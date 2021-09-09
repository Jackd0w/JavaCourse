package practice1;
public class Ball {
    private double radius;
    private String colour;

    public Ball(double r, String c) {
        radius = r;
        colour = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int value) {
        this.radius = value;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Colour is " + this.colour + ", radius is " + this.radius + ", area is " + this.getArea(); 
    }

    public void info() {
        System.out.println("Colour is " + this.colour + ", radius is " + this.radius + ", area is " + this.getArea());
    }
}
