package com.daniu101.stagebasic;

// 什么是死循环，写一个死循环程序
public class WhileKill {

    public static void main(String[] args) {

        int i = 0;

        //条件一直是 true 永无休止的执行
        while (true) {
            System.out.println(i);
            i++;
        }
    }
}
