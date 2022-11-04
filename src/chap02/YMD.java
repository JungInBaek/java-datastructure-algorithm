package chap02;

public class YMD {
    int y;
    int m;
    int d;

    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    YMD after(int n) {
        d += n;
        if (d > 31) {
            m += d / 31;
            if (m > 12) {
                y += m / 12;
                m = m % 12;
            }
            d = d % 31;
        }

        return this;
    }

    YMD before(int n) {
        if (n > d) {
            if (n > 31) {
                if ((n / 31) > 12) {
                    y -= (n / 31) / 12;
                    m -= (n / 31);
                } else {
                    if ((n / 31) > m) {
                        y--;
                        m = 12 + (m - (n / 31));
                        d = 31 + (d - n);
                    } else {
                        m -= n / 31;
                        d -= n % 31;
                    }
                }
            } else {
                d = 31 + (d - n);
                m--;
            }
        } else {
            d -= n;
        }


        return this;
    }
}
