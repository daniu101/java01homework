package com.daniu101.chapter11.hw3.model;

import com.alibaba.fastjson.JSONObject;

// 编程题
public class QuestionCode extends Question {

    //编程输入框
    private String inputCode;

    //构造方法 id、题号、所属阶段、题干、题的描述、文字解析
    public QuestionCode(long id,int number,QuestionStage questionStage,String stem,String description,String explainWord){
        this.setId(id);
        this.setNumber(number);
        this.setQuestionStage(questionStage);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
