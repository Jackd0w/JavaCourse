import java.io.*;

public class RepeatInput {
    public RepeatInput(int N) {
        for (int i = 1; i <= N; i++) {
            repeatEnteringNumberNTimes(i, i);
        }
    }

    private int repeatEnteringNumberNTimes(int number, int n) {
        if (n == 0) return 0;
        System.out.print(number + " ");
        return repeatEnteringNumberNTimes(number, n - 1);
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Input N: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        new RepeatInput(Integer.parseInt(N));
    }
}
