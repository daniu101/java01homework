package com.daniu101.chapter7.hw2;

import java.util.Arrays;

/*
可以有两种理解
第一种：二位数组元素（一维数组）的某一个最大值 进行比较
第二种：二位数组元素（一维数组）的所有元素和 进行比较
都是可以的
此例子实现了第一种
 */
public class Array2MinMax {

    public static void main(String[] args) {

        int[][] int2 = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};

        //找出第一个元素的最大值和最小值
        int[] int0 = int2[0];
        //升序排序
        Arrays.sort(int0);
        int max = int0[int0.length - 1];
        int min = int0[0];

        //将 max 与其它元素进行比较，若其它元素更大，则替换
        for (int i = 1; i < int2.length; i++) {

            //二维数组的元素是一个一维数组
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

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);

    }
}
