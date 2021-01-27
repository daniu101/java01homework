package com.daniu101.stagebasic;

// 使用程序计算正整数的阶乘。
public class Factorial {

    public static void main(String[] args) {

        //输入一个数
        int num = 0;

        //特例 0! = 1
        int count = 1;

        if (num != 0) {

            for (int i = 1; i < num + 1; i++) {
                count *= i;
            }

        }

        System.out.println(num + "的阶乘是：" + count);

    }
}
