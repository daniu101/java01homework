package com.daniu101.chapter11.hw1;

// trim方法 删除字符串的头尾空白符
public class Trim {

    public static void main(String[] args) {

        String str = " 你好 我好 ";
        System.out.println(str);

        /*
        研究一个方法
        返回类型：void 这个关键字时，不需要接收
         */
        String str2 = str.trim();
        System.out.println(str2);

    }
}
