package chap05;

import java.util.Scanner;

public class Q7 {

    static String[] name = {"A", "B", "C"};
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.printf("원반[%d]을(를) %s기둥에서 %s기둥으로 옮김\n", no, name[x - 1], name[y - 1]);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이 탑");
        System.out.print("원반의 개수: ");
        int n = scanner.nextInt();

        move(n, 1, 3);
    }
}
