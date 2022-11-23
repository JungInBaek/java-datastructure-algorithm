package chap05;

import java.util.Scanner;

public class Q4 {
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        recur2(x);
    }

    /**
     * 하향식
     * recur2(4)
     * recur2(2)
     * recur2(0)
     * print(2)         2
     * recur2(1)
     * recur2(-1)
     * print(1)         1
     * recur2(0)
     * print(4)         4
     * recur2(3)
     * recur2(1)
     * recur2(-1)
     * print(1)         1
     * recur2(0)
     * print(3)         3
     * recur2(2)
     * recur2(0)
     * print(2)         2
     * recur2(1)
     * recur2(-1)
     * print(1)         1
     * recur2(0)
     * 2 1 4 1 3 2 1
     *
     *
     * 상향식
     * recur2(1) : 1
     * recur2(2) : 2 1
     * recur2(3) : 1 3 2 1
     * recur2(4) : 2 1 4 1 3 2 1
     */
}
