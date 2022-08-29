package chap02;

import java.util.Scanner;

//  연습문제 Q2
public class Q2 {
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = scanner.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        reverse(x);

        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
