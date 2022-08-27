package chap01;

import java.util.Scanner;

//  연습문제 Q11
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("양의 정수 : ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("양의 정수를 입력하세요!");
            }
        } while (num <= 0);


        int n = 0;
        while (num > 0) {
            num /= 10;
            n++;
        }

        System.out.println("그 수는 " + n + "자리입니다.");
    }
}
