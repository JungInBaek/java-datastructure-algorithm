package chap03;

import java.util.Scanner;

public class Q4 {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        System.out.printf("%3s|", " ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int i = 0; i < n; i++) {
            System.out.print("---");
        }
        System.out.println("---");
        do {
            int pc = (pl + pr) / 2;
            System.out.printf("%3s|", " ");
            for (int i = 0; i < n; i++) {
                if (i == pl) {
                    System.out.printf("%3s", " <-");
                } else if (i == pc) {
                    System.out.printf("%3s", "+");
                } else if (i == pr) {
                    System.out.printf("%4s", "->");
                    break;
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println();
            System.out.printf("%3d|", pc);
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", a[i]);
            }
            System.out.println();
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
            System.out.printf("%3s|\n", " ");
        } while(pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int idx = binSearch(x, num, key);

        System.out.println();
        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
