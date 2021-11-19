import java.util.Scanner;
import java.util.Stack;

public class Launch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert number of cards");
        int N = in.nextInt();

        Stack<Integer> first = new Stack<>();
        for (int i = 0; i < N; i++) {
            System.out.print("Insert number of first player: " + i + ": ");
            first.push(in.nextInt());
        }

        System.out.println();

        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < N; i++) {
            System.out.print("Insert number of second player: " + i + ": ");
            second.push(in.nextInt());
        }

        GameRules game = new GameRules(first, second);
        game.searchForWinner();
        game.outputWinner();
    }
}

