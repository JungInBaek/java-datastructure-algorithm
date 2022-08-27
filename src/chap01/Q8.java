package chap01;

import java.util.Scanner;

//  연습문제 Q8
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();

        int sum = (1 + n) * n / 2;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
