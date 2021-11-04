import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int value) {
        if (value > 0 && value <= 5) {
            radius = value;
        }
    }

    public Circle (int width, int height, int radius) {
        super(width, height);
        this.radius = radius;
    }

    public Circle (int width, int height, int radius, Color colour) {
        super(width, height, colour);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Ellipse2D.Double circle = new Ellipse2D.Double(getWidth(), getHeight(), radius * 2, radius * 2);
        graphics2D.setColor(getColour());
        graphics2D.fill(circle);
    }
}
