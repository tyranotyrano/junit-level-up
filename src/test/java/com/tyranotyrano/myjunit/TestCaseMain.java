package com.tyranotyrano.myjunit;

public class TestCaseMain {

    public static void main(String[] args) {
        // 0. 테스트 실행 갯수를 기록하기 위해 TestResult 객체 생성
        TestResult testResult = new TestResult();

        // 1. 간단한 테스트 실행
        new SimpleTestCase("runTest").execute(testResult);
        System.out.println();
        // 2. 인자를 받는 테스트 실행
        new ArgumentTestCase("runTestWithArg").execute(testResult, "매개변수 입니다.");
        System.out.println();

        // 3. 인자를 여러개 받는 테스트실행
        new ManyArgumentsTestCase("runTestWithArgs").execute(testResult, "사과", "배", "바나나");

        // 4. 실행한 총 테스트 갯수 출력
        System.out.println("=============================================");
        testResult.printTestCount();
    }
}
