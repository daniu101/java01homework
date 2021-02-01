package com.daniu101.chapter11.hw32.model;

// 所有题型的父类
public class Test {

    /*
id
题号
所属阶段
题干
题的描述
文字解析
     */
    private long id;
    private int number;
    private TestPhase testPhase;
    private String stem;
    private String description;
    private String explainWord;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TestPhase getTestPhase() {
        return testPhase;
    }

    public void setTestPhase(TestPhase testPhase) {
        this.testPhase = testPhase;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplainWord() {
        return explainWord;
    }

    public void setExplainWord(String explainWord) {
        this.explainWord = explainWord;
    }
}
