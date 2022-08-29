package chap02;

import java.util.Scanner;

//  배열 요소의 최댓값을 나타냅니다(값을 입력 받음).
public class MaxOfArray {
    //  배열 a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int n = scanner.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = scanner.nextInt();
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
