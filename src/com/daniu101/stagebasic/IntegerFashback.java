package com.daniu101.stagebasic;

//给出一个整数，然后倒序输出。
public class IntegerFashback {

    public static void main(String[] args) {

        int num = 123456;

        while (num != 0) {
            // 这个数不是0

            //找出个位数
            int b = num % 10;
            System.out.print(b);

            // 削减个位数、十位数...
            num = num / 10;
            //System.out.println(num);

        }

    }
}
