package chap01;

import java.util.Scanner;

//  연습문제 Q9
public class Q9 {
    static int sumof(int a, int b) {
        if (a < b) {
            return (a + b) * (b - a + 1) / 2;
        } else {
            return (a + b) * (a - b + 1) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();

        System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a, b) + "입니다.");
    }
}
