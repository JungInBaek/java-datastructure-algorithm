package chap02;

public class CardConv {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits; i++) {
            char t = d[i];
        }
    }

    public static void main(String[] args) {

    }
}
