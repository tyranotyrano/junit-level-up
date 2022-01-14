package com.tyranotyrano.myjunit;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class TestCase {

    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public void execute(Object... args) {
        before();
        executeTestCase(args);
        after();
    }

    protected void before() {}
    
    private void executeTestCase(Object... args) {
        List<Class<?>> paramTypes = Arrays.stream(args)
                                          .map(Object::getClass)
                                          .collect(Collectors.toList());
        try {
            Method method = this.getClass()
                                .getMethod(testCaseName, paramTypes.toArray(new Class[args.length]));
            method.invoke(this, args);
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void after() {}
}
