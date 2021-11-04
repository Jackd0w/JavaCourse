import java.awt.*;

public abstract class Shape {
    private int x, y;
    private Color colour;

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getWidth() {
        return x;
    }

    public void setWidth(int x) {
        this.x = x;
    }

    public int getHeight() {
        return y;
    }

    public void setHeight(int y) {
        this.y = y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y, Color colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public abstract void draw(Graphics graphics);
}
