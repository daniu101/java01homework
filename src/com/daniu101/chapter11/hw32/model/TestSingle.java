package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

// 单选题
public class TestSingle extends Test{

//单选列表：数组
private String[] options = new String[5];

    //id、题号、所属阶段、题干、题的描述、文字解析
    public TestSingle(long id, int number, TestPhase testPhase, String stem, String description, String explainWord) {
        this.setId(id);
        this.setNumber(number);
        this.setTestPhase(testPhase);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {

        int count = 0;
        for (String str:options) {
            if (!"".equals(str)){
                count++;
            }
        }

        if (count == 1){
            this.options = options;
        }else {
            System.out.println("选多了");
        }

    }

}
