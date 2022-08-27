package chap01;

//  연습문제 Q13
public class Q13 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.print("   |");
            } else if (i == 1) {
                System.out.printf("%2d", i);
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        System.out.println("---+---------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d|", i);
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.printf("%2d", i + j);
                } else {
                    System.out.printf("%3d", i + j);
                }
            }
            System.out.println();
        }
    }
}
