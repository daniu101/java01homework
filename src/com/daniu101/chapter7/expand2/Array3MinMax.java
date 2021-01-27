package com.daniu101.chapter7.expand2;

import java.util.Arrays;

public class Array3MinMax {

    public static void main(String[] args) {

        int[][][] int3 = {{{1, 4}, {4, 9}}, {{1, 2}, {1, 2}, {1, 2}}};

        //找出第一个元素的最大值和最小值
        int[] int0 = int3[0][0];
        //升序排序
        Arrays.sort(int0);
        int max = int0[int0.length - 1];
        int min = int0[0];

        //将 max 与其它元素进行比较，若其它元素更大，则替换
        for (int i = 1; i < int3.length; i++) {

            int[][] int2 = int3[i];

            for (int j = 0; j < int2.length; j++) {

                int[] int1 = int2[i];

                //找出一维数组的最大值
                Arrays.sort(int1);

                int max1 = int1[int1.length - 1];

                //找最大值
                if (max1 > max) {
                    max = max1;
                }

                //找最小值
                if (max1 < min) {
                    min = max1;
                }


            }


        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);

    }
}
