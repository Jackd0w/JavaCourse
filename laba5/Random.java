import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static int nextInt(int max) {
        return ThreadLocalRandom.current().nextInt(0, max+ 1);
    }
    public static int nextInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
