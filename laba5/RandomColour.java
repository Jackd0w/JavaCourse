import java.awt.*;

public class RandomColour {
    public static Color get() {
        Random random = new Random();
        int r = Random.nextInt(255);
        int g = Random.nextInt(255);
        int b = Random.nextInt(255);
        return new Color(r, g, b);
    }
}
