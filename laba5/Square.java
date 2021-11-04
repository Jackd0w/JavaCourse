import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape{
    private final int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public Square(int x, int y, int side, Color colour) {
        super(x, y, colour);
        this.side = side;
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D.Double square = new Rectangle2D.Double(getWidth(), getHeight(), side, side);
        graphics2D.setColor(getColour());
        graphics2D.fill(square);
    }
}
