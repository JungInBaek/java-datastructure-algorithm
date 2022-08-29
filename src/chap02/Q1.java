package chap02;

import java.util.Random;
import java.util.Scanner;

//  연습문제 Q1
public class Q1 {
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
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수는 다음과 같습니다. : ");
        int n = random.nextInt(10) + 1;

        int[] height = new int[n];
        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < height.length; i++) {
            height[i] = random.nextInt(100) + 100;
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
