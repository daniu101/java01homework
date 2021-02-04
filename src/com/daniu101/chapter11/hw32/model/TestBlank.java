package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

//  填空题
public class TestBlank extends Test {

    // 输入框
    private String blank;

    //id、题号、所属阶段、题干、题的描述、文字解析
    public TestBlank(long id, int number, TestPhase testPhase, String stem, String description, String explainWord) {
        this.setId(id);
        this.setNumber(number);
        this.setTestPhase(testPhase);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

}
