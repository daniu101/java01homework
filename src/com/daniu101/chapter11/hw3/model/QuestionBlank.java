package com.daniu101.chapter11.hw3.model;

import com.alibaba.fastjson.JSONObject;

// 填空题
public class QuestionBlank extends Question {

    //填空输入框
    private String inputBlank;

    //构造方法 id、题号、所属阶段、题干、题的描述、文字解析
    public QuestionBlank(long id,int number,QuestionStage questionStage,String stem,String description,String explainWord){
        this.setId(id);
        this.setNumber(number);
        this.setQuestionStage(questionStage);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getInputBlank() {
        return inputBlank;
    }

    public void setInputBlank(String inputBlank) {
        this.inputBlank = inputBlank;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
