package chap05;

import chap04.IntStack;

import java.util.Scanner;

public class Q6 {

    static void recur3(int n) {
        IntStack stack = new IntStack(n);
        IntStack stack2 = new IntStack(n);
        int sw = 0;

        while(true) {
            if (n > 0) {
                stack.push(n);
                stack2.push(sw);

                if (sw == 0) {
                    n -= 1;
                } else if (sw == 1) {
                    n -= 2;
                    sw = 0;
                }
                continue;
            }

            do {
                n = stack.pop();
                sw = stack2.pop() + 1;

                if (sw == 2) {
                    System.out.println(n);
                    if (stack.isEmpty()) {
                        return;
                    }
                }
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();

        recur3(x);
    }
}
