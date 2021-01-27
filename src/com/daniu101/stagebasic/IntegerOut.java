package com.daniu101.stagebasic;

import org.apache.commons.lang3.ArrayUtils;

// 给出任意一个1-5位数，按如下规律输入它们的结果。
public class IntegerOut {

    public static void main(String[] args) {

        int num = 125;
        //使用数组存放
        int[] arr5 = new int[5];
        //索引
        int index = 0;

        while (num != 0) {
            // 这个数不是0

            //找出个位数
            int b = num % 10;

            //找出个位数 、十位数...
            arr5[index] = b;
            index++;

            // 削减个位数、十位数...
            num = num / 10;

        }

        System.out.println(ArrayUtils.toString(arr5));
        //倒叙输出
        for (int i = arr5.length; i > 0; i--) {

            switch (i) {
                case 5:
                    System.out.print("万位数：");
                    break;
                case 4:
                    System.out.print("千位数：");
                    break;
                case 3:
                    System.out.print("百位数：");
                    break;
                case 2:
                    System.out.print("十位数：");
                    break;
                case 1:
                    System.out.print("个位数：");
                    break;
                default:
                    break;
            }

            System.out.println(arr5[i - 1]);
        }

    }
}
