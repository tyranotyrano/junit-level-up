package com.tyranotyrano.myjunit;

public abstract class TestCase {

    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public abstract void execute();
}
