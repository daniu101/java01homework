package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

// 编程题
public class TestCode extends Test{
    
    // 编程输入框
    private String blankCode;

    //id、题号、所属阶段、题干、题的描述、文字解析
    public TestCode(long id, int number, TestPhase testPhase, String stem, String description, String explainWord) {
        this.setId(id);
        this.setNumber(number);
        this.setTestPhase(testPhase);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String getBlankCode() {
        return blankCode;
    }

    public void setBlankCode(String blankCode) {
        this.blankCode = blankCode;
    }

}
