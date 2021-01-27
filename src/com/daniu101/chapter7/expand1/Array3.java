package com.daniu101.chapter7.expand1;

import org.apache.commons.lang3.ArrayUtils;

public class Array3 {

    public static void main(String[] args) {

        //静态初始化
        int[][][] int3 = {{{1, 4}, {4, 9}}, {{1, 2}, {1, 2}, {1, 2}}};

        //System.out.println(ArrayUtils.toString(int3));

        //增强for
        for (int[][] int2 : int3) {

            //三维数组的元素是 二维数组
            //System.out.println(ArrayUtils.toString(int2));
            for (int[] int1 : int2) {

                //二维数组的元素是 一维数组
                System.out.println(ArrayUtils.toString(int1));

            }

        }

    }
}
