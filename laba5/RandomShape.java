import java.awt.*;

public class RandomShape {
    private final static int amountShapes = 3;

    public static Shape create() {
        int number = Random.nextInt(0, amountShapes - 1);
        int x = Random.nextInt(20, 330);
        int y = Random.nextInt(20, 330);
        Color colour = RandomColour.get();
        return switch(number) {
            case 0 -> new Square(x, y, 15, colour);
            case 1 -> new Circle(x, y, 8,  colour);
            default-> null;
        };
    }
}
