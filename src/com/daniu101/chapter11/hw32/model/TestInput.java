package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

// 简答题
public class TestInput extends Test{
    
    // 简答输入框
    private String blankInput;

    // 视频解析
    private String explainVideoUrl;

    //id、题号、所属阶段、题干、题的描述、文字解析
    public TestInput(long id, int number, TestPhase testPhase, String stem, String description, String explainWord) {
        this.setId(id);
        this.setNumber(number);
        this.setTestPhase(testPhase);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getBlankInput() {
        return blankInput;
    }

    public void setBlankInput(String blankInput) {
        this.blankInput = blankInput;
    }

    public String getExplainVideoUrl() {
        return explainVideoUrl;
    }

    public void setExplainVideoUrl(String explainVideoUrl) {
        this.explainVideoUrl = explainVideoUrl;
    }

}
