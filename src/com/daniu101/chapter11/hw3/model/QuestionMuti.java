package com.daniu101.chapter11.hw3.model;

import com.alibaba.fastjson.JSONObject;

// 多选题
public class QuestionMuti extends Question {

    //多选列表
    private String[] items = new String[10];
    //视频解析
    private String explainVideo;

    //构造方法 id、题号、所属阶段、题干、题的描述、文字解析
    public QuestionMuti(long id,int number,QuestionStage questionStage,String stem,String description,String explainWord){
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
