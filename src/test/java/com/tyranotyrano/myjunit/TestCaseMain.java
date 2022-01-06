package com.tyranotyrano.myjunit;

public class TestCaseMain {

    public static void main(String[] args) {
        // 1. 간단한 테스트 실행
        new SimpleTestCase("runTest").execute();

        // 2. 인자를 받는 테스트 실행
        new ArgumentTestCase("runTestWithArgs").execute("매개변수 입니다.");
    }
}
