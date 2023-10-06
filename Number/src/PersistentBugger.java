package com.kar.practice.exercise.Number.src;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
        System.out.println(persistence(3));
        System.out.println(persistence(57));
        System.out.println(persistence(123456));


    }
    public static int persistence(long n) {
        long m = 1, r = n;

        if (r / 10 == 0)
            return 0;

        for (r = n; r != 0; r /= 10)
            m *= r % 10;

        return persistence(m) + 1;
    }
}
