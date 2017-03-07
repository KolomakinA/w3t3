package com.company;

/**
 * Created by kolom on 07.03.2017.
 * F1=1;
 * F2=1;
 * Fn=F(n-1) + F(n-2)
 */
public class Fibonacci {
    public long getNumber(int position){
        if (position < 1) return -1;
        else if (position == 1 || position == 2) return 1;
        else {
            long[] f = new long[position];
            f[1] = f[0] = 1;
            for (int i = 2; i < position; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            return f[position - 1];
        }
    }
}
