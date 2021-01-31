package com.daniu101.chapter11.hw3.model;

// 所有试题的父类
public class Question {

    // id
    private long id;
    // 题号
    private int number;
    // 所属阶段
    private QuestionStage questionStage;
    // 题干
    private String stem;
    // 题的描述
    private String description;
    //文字解析
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
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("题号应为正整数");
        }

    }

    public QuestionStage getQuestionStage() {
        return questionStage;
    }

    public void setQuestionStage(QuestionStage questionStage) {
        this.questionStage = questionStage;
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
