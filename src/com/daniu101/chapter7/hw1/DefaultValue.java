package com.daniu101.chapter7.hw1;

public class DefaultValue {

    public static void main(String[] args) {

        /*
        8种基本数据类型：
        整数类型：byte、short、int、long
        浮点类型：double、float
        字符类型：char
        布尔类型：boolean
         */
        byte[] byteDv = new byte[10];
        System.out.println("byte类型默认值：" + byteDv[0]);

        short[] shortDv = new short[10];
        System.out.println("short类型默认值：" + shortDv[0]);

        int[] intDv = new int[10];
        System.out.println("int类型默认值：" + intDv[0]);

        long[] longDv = new long[10];
        System.out.println("long类型默认值：" + longDv[0]);

        double[] doubleDv = new double[10];
        System.out.println("double类型默认值：" + doubleDv[0]);

        float[] floatDv = new float[10];
        System.out.println("float类型默认值：" + floatDv[0]);

        char[] charDv = new char[10];
        System.out.println("char类型默认值：" + charDv[0]);

        boolean[] booleanDv = new boolean[10];
        System.out.println("boolean类型默认值：" + booleanDv[0]);
    }
}
