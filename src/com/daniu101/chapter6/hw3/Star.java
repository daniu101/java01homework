package com.daniu101.chapter6.hw3;

public class Star {

    public static void main(String[] args) {

        for (int i = 1; i < 8; i += 2) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
