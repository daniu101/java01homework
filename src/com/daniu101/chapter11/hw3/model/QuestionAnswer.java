package com.daniu101.chapter11.hw3.model;

import com.alibaba.fastjson.JSONObject;

// 简答题
public class QuestionAnswer extends Question {

    //简答输入框
    private String inputAnswer;
    //视频解析
    private String explainVideo;

    //构造方法 id、题号、所属阶段、题干、题的描述、文字解析
    public QuestionAnswer(long id,int number,QuestionStage questionStage,String stem,String description,String explainWord){
        this.setId(id);
        this.setNumber(number);
        this.setQuestionStage(questionStage);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String inputAnswer) {
        this.inputAnswer = inputAnswer;
    }

    public String getExplainVideo() {
        return explainVideo;
    }

    public void setExplainVideo(String explainVideo) {
        this.explainVideo = explainVideo;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
