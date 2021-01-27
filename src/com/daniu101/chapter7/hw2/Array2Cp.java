package com.daniu101.chapter7.hw2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Array2Cp {

    public static void main(String[] args) {

        int[][] int2 = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};

        System.out.println(int2);
        System.out.println(ArrayUtils.toString(int2));

        int[][] int2Cp = ArrayUtils.clone(int2);

        System.out.println(int2Cp);
        System.out.println(ArrayUtils.toString(int2Cp));

        System.out.println(Arrays.toString(int2Cp));

    }
}
