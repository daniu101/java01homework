package com.daniu101.stagebasic;

// 请把9*9小口诀表中的乘号变为加号，并输出。如2*9=18，改为2+9=11
public class Out99 {

    public static void main(String[] args) {

        //第1-9行
        for (int i = 1; i < 10; i++) {

            //每行个数增加
            for (int j = 1; j <= i; j++) {

                // \t 跳格
                System.out.print(j + "+" + i + "=" + (j + i) + "\t");
            }

            System.out.println();
        }

    }
}
