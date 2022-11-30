package chap05;

import chap04.IntStack;

import java.util.Scanner;

public class Q8 {
    static void move(int no, int x, int y) {
        IntStack xstk = new IntStack(no);
        IntStack ystk = new IntStack(no);
        IntStack sstk = new IntStack(no);
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk.push(x);
                ystk.push(y);
                sstk.push(sw);
                no -= 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("원반[%d]를 %d기둥에서 %d기둥으로 옮김 : %d\n", no, x, y, sw);

            if (sw == 1 && no > 1) {
                xstk.push(x);
                ystk.push(y);
                sstk.push(sw);
                no -= 1;
                x = 6 - x - y;
                if (++sw == 2) {
                    sw = 0;
                }
                continue;
            }

            do {
                if (xstk.isEmpty() && ystk.isEmpty() && sstk.isEmpty()) {
                    return;
                }
                x = xstk.pop();
                y = ystk.pop();
                sw = sstk.pop() + 1;
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이 탑");
        System.out.print("원반의 개수: ");
        int n = scanner.nextInt();

        move(n, 1, 3);
    }
}