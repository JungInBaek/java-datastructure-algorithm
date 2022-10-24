package chap02;

//  연습문제 Q5
public class Q5 {
//    static void rcopy(int[] a, int[] b) {
//        for (int i = 0; i < b.length; i++) {
//            a[b.length - i - 1] = b[i];
//        }
//    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            a[i] = b[b.length - i - 1];
            a[b.length - i - 1] = b[i];
        }
        if (b.length % 2 != 0) {
            a[b.length / 2] = b[b.length / 2];
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
