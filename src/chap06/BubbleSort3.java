package chap06;

import java.util.Scanner;

public class BubbleSort3 {

    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬 (버전 3)
    static void bubbleSort(int[] a, int n) {
        int k = 0;                              // a[k]보다 앞 쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n - 1;                   // 마지막으로 요소를 교환한 위치
            for (int j = n - 1; j > k; j++) {   // 패스
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, n);       // 배열 x를 버블 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }

}
