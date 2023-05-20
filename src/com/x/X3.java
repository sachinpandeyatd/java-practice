package com.x;

import java.util.Hashtable;

public class X3 {
    public static void leftshift(int i, int j)
    {
        i <<= j;
    }
    public static void main(String args[])
    {
        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(4 << 2);
    }
}
