package chap02;

import java.util.Random;
import java.util.Scanner;

//  배열 요소의 최댓값을 나타냅니다(값을 난수로 생성).
public class MaxOfArrayRand {
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
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수는 다음과 같습니다. : ");
        int n = scanner.nextInt();

        int[] height = new int[n];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < n; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
