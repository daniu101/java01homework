package com.daniu101.chapter7.expand2;

import org.apache.commons.lang3.ArrayUtils;

public class Array3Cp {

    public static void main(String[] args) {

        int[][][] int3 = {{{1, 4}, {4, 9}}, {{1, 2}, {1, 2}, {1, 2}}};

        System.out.println(int3);
        System.out.println(ArrayUtils.toString(int3));

        int[][][] int3Cp = ArrayUtils.clone(int3);

        System.out.println(int3Cp);
        System.out.println(ArrayUtils.toString(int3Cp));

    }
}
