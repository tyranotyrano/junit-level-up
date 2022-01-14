package com.tyranotyrano.myjunit;

public class TestCaseMain {

    public static void main(String[] args) {
        // 1. 간단한 테스트 실행
        new SimpleTestCase("runTest").execute();
        System.out.println();
        // 2. 인자를 받는 테스트 실행
        new ArgumentTestCase("runTestWithArg").execute("매개변수 입니다.");
        System.out.println();

        // 3. 인자를 여러개 받는 테스트실행
        new ManyArgumentsTestCase("runTestWithArgs").execute("사과", "배", "바나나");
    }
}
