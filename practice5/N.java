import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N {
    public N(int N) {
        repeatEnteringNumberNTimes(1, N + 1);
    }

    private int repeatEnteringNumberNTimes(int min, int max) {
        if (min == max) return 0;
        System.out.print(min + " ");
        return repeatEnteringNumberNTimes(min + 1, max);
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Input N: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        new N(Integer.parseInt(N));
    }
}
