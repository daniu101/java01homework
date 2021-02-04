package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

// 多选题
public class TestMuti extends Test {

    //多选列表：数组
    private String[] optionsMuti = new String[10];

    // 视频解析
    private String explainUrl;


    //id、题号、所属阶段、题干、题的描述、文字解析
    public TestMuti(long id, int number, TestPhase testPhase, String stem, String description, String explainWord) {
        this.setId(id);
        this.setNumber(number);
        this.setTestPhase(testPhase);
        this.setStem(stem);
        this.setDescription(description);
        this.setExplainWord(explainWord);
    }

    public String[] getOptionsMuti() {
        return optionsMuti;
    }

    public void setOptionsMuti(String[] optionsMuti) {

        int count = 0;
        for (String str : optionsMuti) {
            if (!"".equals(str)) {
                count++;
            }
        }

        if (count >= 3 && count <= 7) {
            this.optionsMuti = optionsMuti;
        } else {
            System.out.println("选多了");
        }

    }

    public String getExplainUrl() {
        return explainUrl;
    }

    public void setExplainUrl(String explainUrl) {
        this.explainUrl = explainUrl;
    }

}
