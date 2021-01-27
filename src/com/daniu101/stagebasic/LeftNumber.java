package com.daniu101.stagebasic;

/*
请在8，9，7，6，4，5，3，2中找出尚左数
左边的数字都比其大(或无数字)，且其右边的数字都比其小(或无数字)
 */

import java.util.Arrays;

public class LeftNumber {

    public static void main(String[] args) {

        // 静态初始化
        int[] init = {8, 9, 7, 6, 4, 5, 3, 2};

        for (int i = 0; i < init.length; i++) {

            int ele = init[i];

            //根据当前位置，把原始数组分为两部分
            int[] left = new int[i];
            int[] right = new int[init.length - i - 1];

            System.arraycopy(init, 0, left, 0, i);
            System.arraycopy(init, i + 1, right, 0, init.length - i - 1);

            /*
            左边的数字都比其大(或无数字)
            我们在最左边找出 最小值，如果最小的值 > ele，代表所有值都 > ele
             */

            //升序排序，找最小值
            Arrays.sort(left);

            boolean tagMin = true;
            if (left.length != 0) {
                int min = left[0];
                tagMin = min > ele;
            }

            /*
            右边的数字都比其小(或无数字)
            我们在最左边找出 最大值，如果最大的值 < ele，代表所有值都 < ele
             */

            //升序排序，找最大值
            Arrays.sort(right);

            boolean tagMax = true;
            if (right.length != 0) {
                int max = right[right.length - 1];
                tagMax = max < ele;
            }

            //且的关系
            if (tagMin & tagMax) {
                System.out.println(ele);
            }

            //结果是7、6、3、2

        }

    }
}
