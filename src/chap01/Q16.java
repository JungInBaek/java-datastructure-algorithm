package chap01;

//  연습문제 Q16
public class Q16 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = ((n - 1) * 2 + 1); j >= 1; j--) {
                if (j <= (n - i)) {
                    System.out.print("   ");
                } else if (j >= (n + i)) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spira(5);
    }
}
