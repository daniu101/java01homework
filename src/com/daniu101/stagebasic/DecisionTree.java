package com.daniu101.stagebasic;

//请用代码完成下面的决策树
public class DecisionTree {

    public static void main(String[] args) {

        // 男:true 女:false
        boolean gender = true;
        //年龄
        int age = 30;
        // 平均消费
        int consume = 20;

        if (gender) {
            //男性

            //第二层 年龄
            if (age < 20) {

                // 第三层 平均消费
                switch (consume) {
                    case 20:
                        System.out.println("A");
                        break;
                    case 40:
                        System.out.println("B");
                        break;
                    case 60:
                        System.out.println("C");
                        break;
                    case 80:
                        System.out.println("D");
                        break;
                    default:
                        System.out.println("暂无功能代码");

                }

            } else if (20 < age && age < 30) {

                System.out.println("暂无功能代码");

            } else if (30 < age && age < 40) {

                System.out.println("暂无功能代码");

            } else {

                System.out.println("暂无功能代码");
            }


        } else {
            //女性
            System.out.println("暂无功能代码");
        }


        //第三层 平均消费

    }
}
