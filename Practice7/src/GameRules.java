import java.util.Stack;
import java.util.Stack;

public class GameRules {
    private Stack<Integer> firstPlayer;
    private Stack<Integer> secondPlayer;

    private int numberOfMoves = 0;
    private final int maxNumberOfMoves = 106;

    public GameRules(Stack<Integer> firstPlayer, Stack<Integer> secondPlayer) {
        this.firstPlayer = flipOver(firstPlayer);
        this.secondPlayer = flipOver(secondPlayer);
    }

    public void outputWinner() {
        if (numberOfMoves < maxNumberOfMoves) {
            String namePlayer;
            if (firstPlayer.empty())
                namePlayer = "Second";
            else
                namePlayer = "First";
            String result = String.format("Winner: %s. Count moves: %d", namePlayer, numberOfMoves);
            System.out.println(result);
        } else {
            System.out.println("botva");
        }
        System.out.println("First stack: " + flipOver(firstPlayer));
        System.out.println("Second stack: " + flipOver(secondPlayer));
    }

    public void searchForWinner() {
        if (firstPlayer.empty() || secondPlayer.empty() || numberOfMoves >= maxNumberOfMoves)
            return ;

        int numberPlayerFirst = firstPlayer.pop();
        int numberPlayerSecond = secondPlayer.pop();

        if (numberPlayerFirst > numberPlayerSecond) {
            firstPlayer = addFirstElement(firstPlayer, numberPlayerFirst);
            firstPlayer = addFirstElement(firstPlayer, numberPlayerSecond);
        } else {
            secondPlayer = addFirstElement(secondPlayer, numberPlayerFirst);
            secondPlayer = addFirstElement(secondPlayer, numberPlayerSecond);
        }

        numberOfMoves++;
        searchForWinner();
    }

    private Stack<Integer> addFirstElement(Stack<Integer> stack, Integer item) {
        Stack<Integer> newStack = new Stack<>();
        while (!stack.empty()) {
            newStack.push(stack.pop());
        }
        newStack.push(item);
        return flipOver(newStack);
    }

    private Stack<Integer> flipOver(Stack<Integer> stack) {
        Stack<Integer> flipStack = new Stack<>();
        while (!stack.empty()) {
            flipStack.push(stack.pop());
        }
        return flipStack;
    }
}
