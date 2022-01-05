package ExamPreparation;

import java.util.HashMap;
import java.util.Map;

public class MemoFb{
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    private static int MemoFb(int n) {
        if(!memo.containsKey(n)) {
            memo.put(n, MemoFb(n - 1) + MemoFb(n - 2));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(MemoFb(5));
    }
}