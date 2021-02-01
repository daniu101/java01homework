package com.daniu101.chapter11.hw32.model;

import com.alibaba.fastjson.JSON;

// 简答题 的测试
public class TestInputTest extends Test {

    public static void main(String[] args) {


        long id = System.currentTimeMillis();
        int number = 33;
        TestPhase testPhase = TestPhase.EXPECT;
        String stem = "这是题干的描述";
        String description = "这是题信息的描述";
        String explainWord = "这是题的文字解析";

        // 创建了一个简答题的对象
        TestInput testInput = new TestInput(id, number, testPhase, stem, description, explainWord);

        // 简答输入框
        String blankInput = "简答题的输入框输入的信息";
        testInput.setBlankInput(blankInput);

        /*
        视频解析
        Url: 统一资源连接符，uniform resources link
        Uri: 统一资源定位符，uniform resources identifier(网络资源定位身份)
        举例：
        Url:http://www.daniu101.com/
        Uri:互联网资源地址
         */
        String explainVideoUrl = "http://www.daniu101.com/";
        testInput.setExplainVideoUrl(explainVideoUrl);

        System.out.println(testInput);
        System.out.println(testInput.toString());

    }

}
