package chap05;

import java.util.Scanner;

public class Q5 {

    static int count1 = 0;
    static int count2 = 0;

    static String[] memo;

    static void recurMemo(int n) {
        count2++;
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recurMemo(n - 1);
                System.out.println(n);
                recurMemo(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }
    }

    static void recur(int n) {
        count1++;
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        memo = new String[x + 2];
        System.out.println("\n처음 버전");
        recur(x);
        System.out.println("\n메모화");
        recurMemo(x);

        System.out.println("실습 5-3 : " + count1);
        System.out.println("실습 5-6 : " + count2);
    }
}
