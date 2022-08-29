package chap02;

import java.util.Scanner;

//  연습문제 Q3
public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("모든 요소의 합계 = " + sumOf(a));
    }
}
