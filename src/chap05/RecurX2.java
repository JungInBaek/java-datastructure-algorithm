package chap05;

import chap04.IntStack;

public class RecurX2 {
    // 재귀를 제거
    static void recur(int n) {
        IntStack stack = new IntStack(n);

        while(true) {
            if (n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }

            if (stack.isEmpty() != true) {
                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }

            break;
        }
    }
}
