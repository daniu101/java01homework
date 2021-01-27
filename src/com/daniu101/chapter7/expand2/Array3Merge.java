package com.daniu101.chapter7.expand2;

import org.apache.commons.lang3.ArrayUtils;

public class Array3Merge {

    public static void main(String[] args) {

        int[][][] int3 = {{{1, 4}, {4, 9}}, {{1, 2}, {1, 2}, {1, 2}}};
        int[][][] int3Son = {{{1, 1, 1, 1, 1}}};

        //合并两个数组
        int[][][] int3Merge = ArrayUtils.addAll(int3, int3Son);
        System.out.println(ArrayUtils.toString(int3Merge));

    }
}
