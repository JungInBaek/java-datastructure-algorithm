package chap02;

//  연습문제 Q4
public class Q4 {
//    static void copy(int[] a, int[] b) {
//        for (int i = 0; i < b.length; i++) {
//            a[i] = b[i];
//        }
//    }

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            a[i] = b[i];
            a[b.length - 1 - i] = b[b.length - 1 - i];
        }
        if (b.length % 2 != 0) {
            a[b.length / 2] = b[b.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {1, 2, 3, 4, 5};

        copy(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
