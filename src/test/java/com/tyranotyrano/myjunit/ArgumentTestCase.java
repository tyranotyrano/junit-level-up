package com.tyranotyrano.myjunit;

public class ArgumentTestCase extends TestCase {

    public ArgumentTestCase(String testCaseName) {
        super(testCaseName);
    }

    public void runTestWithArgs(String arg) {
        System.out.println("ArgumentTestCase 테스트 성공!");
        System.out.println("arg : " + arg);
    }
}
