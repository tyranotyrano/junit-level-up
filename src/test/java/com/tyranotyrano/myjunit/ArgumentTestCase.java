package com.tyranotyrano.myjunit;

import java.lang.reflect.Method;

public class ArgumentTestCase extends TestCase {

    public ArgumentTestCase(String testCaseName) {
        super(testCaseName);
    }

    @Override
    public void execute(Object... args) {
        try {
            Method method = this.getClass()
                                .getMethod(super.testCaseName, String.class);
            method.invoke(this, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void runTestWithArgs(String arg) {
        System.out.println("ArgumentTestCase 테스트 성공!");
        System.out.println("arg : " + arg);
    }
}
