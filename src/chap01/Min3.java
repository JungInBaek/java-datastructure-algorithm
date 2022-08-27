package chap01;

//  연습문제 Q2
public class Min3 {

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(3, 2, 1) = " + min3(3, 2, 1));     //  [A] a > b > c
        System.out.println("min3(3, 2, 2) = " + min3(3, 2, 2));     //  [B] a > b = c
        System.out.println("min3(3, 2, 3) = " + min3(3, 2, 3));     //  [D] a = c > b
        System.out.println("min3(3, 1, 2) = " + min3(3, 1, 2));     //  [C] a > c > b
        System.out.println("min3(2, 1, 3) = " + min3(2, 1, 3));     //  [E] c > a > b
        System.out.println("min3(3, 3, 2) = " + min3(3, 3, 2));     //  [F] a = b > c
        System.out.println("min3(3, 3, 3) = " + min3(3, 3, 3));     //  [G] a = b = c
        System.out.println("min3(2, 2, 3) = " + min3(2, 2, 3));     //  [H] c > a = b
        System.out.println("min3(2, 3, 1) = " + min3(2, 3, 1));     //  [I] b > a > c
        System.out.println("min3(2, 3, 2) = " + min3(2, 3, 2));     //  [J] b > a = c
        System.out.println("min3(1, 3, 2) = " + min3(1, 3, 2));     //  [K] b > c > a
        System.out.println("min3(2, 3, 3) = " + min3(2, 3, 3));     //  [L] b = c > a
        System.out.println("min3(1, 2, 3) = " + min3(1, 2, 3));     //  [M] c > b > a
    }
}
