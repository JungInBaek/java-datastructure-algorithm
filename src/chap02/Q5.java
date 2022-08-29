package chap02;

//  연습문제 Q5
public class Q5 {
    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[b.length - i - 1] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {1, 2, 3, 4, 5};

        rcopy(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
