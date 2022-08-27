package chap01;

//  연습문제 Q17
public class Q17 {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = ((n - 1) * 2 + 1); j >= 1; j--) {
                if (j <= (n - i)) {
                    System.out.print("   ");
                } else if (j >= (n + i)) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        npira(5);
    }
}
