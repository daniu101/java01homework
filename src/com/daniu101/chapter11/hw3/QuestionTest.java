package com.daniu101.chapter11.hw3;

import com.daniu101.chapter11.hw3.model.QuestionSingle;
import com.daniu101.chapter11.hw3.model.QuestionStage;

// 只测试单选题，其他题类似
public class QuestionTest {

    public static void main(String[] args) {

        long id = System.currentTimeMillis();
        int number = 100;
        QuestionStage questionStage = QuestionStage.OOP;
        String stem = "我是题干的内容";
        String description = "我是题的描述的内容";
        String explainWord = "我是题的文字解析的内容";

        QuestionSingle questionSingle = new QuestionSingle(id,number,questionStage,stem,description,explainWord);

        //单选列表
        String[] items = new String[5];
        items[0] = "我是单选选项1";
        items[1] = "我是单选选项2";
        items[2] = "我是单选选项3";
        items[3] = "我是单选选项4";
        items[4] = "我是单选选项5";
        questionSingle.setItems(items);

        System.out.println(questionSingle.toString());

    }
}
