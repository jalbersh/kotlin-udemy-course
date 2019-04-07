package hacker.solution;

import java.util.*;

public class DequeDemo {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            Set hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                hs.add(num);
                if (deque.size() == m+1) {
                    int removed = (int)deque.remove();
                    if (!deque.contains(removed)) {
                        hs.remove(removed);
                    }
                }
                max = Math.max(hs.size(),max);
            }
            System.out.println(max);
        }
}
