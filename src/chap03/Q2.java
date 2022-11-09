package chap03;

import java.util.Scanner;

public class Q2 {
    //  요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        System.out.printf("%3s|", " ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println();
        System.out.println("---+-----------------");

        int i = 0;
        while (true) {
            System.out.printf("%3s|", " ");
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.printf("%2s", "*");
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
            System.out.printf("%3d|", i);
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d", a[j]);
            }
            System.out.println();
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            System.out.printf("%3s|\n", " ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int idx = seqSearch(x, num, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
