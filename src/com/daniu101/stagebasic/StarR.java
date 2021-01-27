package com.daniu101.stagebasic;

/*
输出“R”图形
思路有很多，提供一个参考
 */
public class StarR {

    public static void main(String[] args) {

        //第1部分
        int first = 0;
        //第1个4行 每次多4个星号
        for (int i = 1; i < 16; i += 4) {

            //每行打印的个数
            for (int j = 0; j < i; j++) {

                System.out.print("*");

                first = j;
            }

            //换行
            System.out.println();
        }

        //第2部分
        //第2个3行 分别少 2 3 2 颗星星
        // 对应外层循环的 0 1 2
        int second = first;
        for (int i = 0; i < 3; i++) {

            //减少个数根据第奇数偶数次数确定
            int reduce = 2;
            if (i % 2 != 0) {
                reduce = 3;
            } else {
                reduce = 2;
            }

            //每行打印的个数
            second -= reduce;
            for (int j = second; j > 0; j--) {
                System.out.print("*");
            }

            //换行
            System.out.println("*");

        }

        //第3部分 8行
        for (int i = 0; i < 8; i++) {

            //每行打印个数 根据奇数偶数判定
            if (i % 2 != 0) {

                //如果是第一次打印，多打印一个
                if (i == 1) {
                    System.out.print("*");
                }
                System.out.print("*");

                //空格打印都在这儿
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }

                //打印完空格之后，还有两个星星
                System.out.print("**");

                //换行
                System.out.println();

            } else {
                System.out.println("****");
            }


        }

    }
}
