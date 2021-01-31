package com.daniu101.chapter11.hw3.model;

import com.alibaba.fastjson.JSONObject;

// 单选题
public class QuestionSingle extends Question {

    //单选列表
    private String[] items = new String[5];

    //构造方法 id、题号、所属阶段、题干、题的描述、文字解析
    public QuestionSingle(long id,int number,QuestionStage questionStage,String stem,String description,String explainWord){
        this.setId(id);
        this.setNumber(number);
        this.setQuestionStage(questionStage);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
