import java.awt.*;

public class RandomColour {
    public static Color get() {
        Random random = new Random();
    // Массив из пяти цветов
        Color[] colors = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED,
                Color.CYAN };
        int pos = random.nextInt(colors.length);
    }
}
