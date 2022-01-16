package com.tyranotyrano.myjunit;

import org.opentest4j.AssertionFailedError;

public class FailTestCase extends TestCase {

    public FailTestCase(String testCaseName) {
        super(testCaseName);
    }

    public void runFailTest() {
        System.out.println("FailTestCase 테스트 실패!");
        throw new AssertionFailedError();
    }
}
