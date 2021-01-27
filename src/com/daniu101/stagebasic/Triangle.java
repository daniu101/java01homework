package com.daniu101.stagebasic;

/*
给出任意两个整数作为三角形的两边边长，求第三遍的取值范围
任意两边之和大于第三边，任意两边之差小于第三边
 */

public class Triangle {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        //第三边最小值
        int min = a - b;
        if (min < 0) {
            min = -min;
        }

        //第三边最大值
        int max = a + b;

        System.out.println(min + "< 第三边长 < " + max);


    }
}
