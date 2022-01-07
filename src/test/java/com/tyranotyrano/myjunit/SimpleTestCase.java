package com.tyranotyrano.myjunit;

public class SimpleTestCase extends TestCase {

    public SimpleTestCase(String testCaseName) {
        super(testCaseName);
    }

    public void runTest() {
        System.out.println("SimpleTestCase 테스트 성공!");
    }
}
