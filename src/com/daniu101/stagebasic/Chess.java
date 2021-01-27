package com.daniu101.stagebasic;

// 使用星号代表黑色方框，打印出国际象棋的棋盘
public class Chess {

    public static void main(String[] args) {

        //8行
        for (int i = 0; i < 8; i++) {

            //每行8个
            for (int j = 0; j < 8; j++) {

                //第奇数行
                if ((i + 1) % 2 == 0) {

                    //第奇数个：控制先打印的图形
                    if ((j + 1) % 2 == 0) {
                        System.out.print("□");
                    } else {
                        System.out.print("■");
                    }

                } else {

                    //第偶数行
                    //第奇数个
                    if ((j + 1) % 2 == 0) {
                        System.out.print("■");
                    } else {
                        System.out.print("□");
                    }
                }
            }

            System.out.println();
        }

    }
}
