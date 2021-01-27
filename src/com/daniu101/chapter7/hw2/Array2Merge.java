package com.daniu101.chapter7.hw2;

import org.apache.commons.lang3.ArrayUtils;

public class Array2Merge {

    public static void main(String[] args) {

        int[][] int2 = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};
        int[][] int2Son = {{2, 3, 3}, {3, 4, 5, 5}};

        //合并两个数组
        int[][] int2Merge = ArrayUtils.addAll(int2, int2Son);
        System.out.println(ArrayUtils.toString(int2Merge));

    }
}
