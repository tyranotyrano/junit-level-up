package com.tyranotyrano.myjunit;

import java.lang.reflect.Method;

public class SimpleTestCase extends TestCase {

    public SimpleTestCase(String testCaseName) {
        super(testCaseName);
    }

    @Override
    public void execute() {
        try {
            Method method = this.getClass()
                                .getMethod(super.testCaseName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void runTest() {
        System.out.println("SimpleTestCase 테스트 성공!");
    }
}
