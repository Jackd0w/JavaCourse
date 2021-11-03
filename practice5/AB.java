import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB {
    public AB(int A, int B) {
        if (A < B) {
            outputFromLessToMore(A, B + 1);
        } else {
            outputFromMoreToLess(B - 1, A);
        }
    }

    private int outputFromLessToMore(int min, int max) {
        if (min == max) return 0;
        System.out.print(min + " ");
        return outputFromLessToMore(min + 1, max);
    }

    private int outputFromMoreToLess(int min, int max) {
        if (min == max) return 0;
        System.out.print(max + " ");
        return outputFromMoreToLess(min, max - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input A: ");
        String A = reader.readLine();
        System.out.print("Input B: ");
        String B = reader.readLine();
        new AB(Integer.parseInt(A), Integer.parseInt(B));
    }
}
