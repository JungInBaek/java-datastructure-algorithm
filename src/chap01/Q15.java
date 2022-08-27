package chap01;

import java.util.Scanner;

//  연습문제 Q15
public class Q15 {
    //  왼쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //  왼쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleLU(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //  오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //  오른쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleRB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = scanner.nextInt();
        } while (!(n > 0));

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        triangleLB(n);

        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        triangleLU(n);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        triangleRU(n);

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        triangleRB(n);
    }
}
