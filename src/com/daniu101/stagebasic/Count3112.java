package com.daniu101.stagebasic;

//计算1+2+3+……+3112的值。
public class Count3112 {

    public static void main(String[] args) {

        //定义和
        int sum = 0;
        for (int i = 1; i <= 3112; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("1+2+3+ ... +3112 = " + sum);

    }
}
