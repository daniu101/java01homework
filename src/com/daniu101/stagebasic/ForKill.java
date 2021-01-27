package com.daniu101.stagebasic;

// 什么是死循环，写一个死循环程序
public class ForKill {

    public static void main(String[] args) {

        /*
        相当于while（1）
        不设初值，不判断条件，循环变量不增值，无终止的循环。
         */
        for (; ; ) {
            System.out.println("1");
        }
    }
}
