package com.typeconversion;

import java.util.ArrayList;

public class WrapItUp {
    public static void main(String[] args) {
        int a = 10;

        Integer boxA = a;

        System.out.println(boxA);

//        int aa = null;

        int unBloxedA = boxA;

        Integer x = null;

        int x2 = x;
        System.out.println(x2);

        System.out.println(unBloxedA);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    }
}
