package chap02;

import java.util.ArrayList;
import java.util.Arrays;

//  배열을 복제합니다.
public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }

}
