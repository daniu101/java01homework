package com.daniu101.stagebasic;

// 输出100以内的素数
public class PrimeNumber {

    public static void main(String[] args) {

        int j;

        //控制 1-100 的数据遍历
        for (int i = 1; i < 100; i++) {

            //j = 2 会执行一次
            for (j = 2; j <= i; j++) {

                if (i % j == 0) {
                    //能被比自己小的一个数整除
                    break;
                }
            }

            /*
            i 第几个数
            j 找到的能被整除的数
             */
            if (i <= j) {
                System.out.print(j + " ");
            }
        }

    }
}
