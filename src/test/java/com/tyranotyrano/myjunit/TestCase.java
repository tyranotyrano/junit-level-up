package com.tyranotyrano.myjunit;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TestCase {
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }
    public TestResult execute(Object... args){
        TestResult testResult = createTestResult();
        executeTestCase(testResult, args);

        return testResult;
    }

    public void execute(TestResult testResult, Object... args) {
        testResult.startTest();

        before();
        executeTestCase(args);
        after();
    }

    protected void before() {}
    
    private void executeTestCase(Object... args) {
        logger.info("{} execute ", testCaseName);

        List<Class<?>> paramTypes = Arrays.stream(args)
                                          .map(Object::getClass)
                                          .collect(Collectors.toList());
        try {
            Method method = this.getClass()
                                .getMethod(testCaseName, paramTypes.toArray(new Class[args.length]));
            method.invoke(this, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void after() {}

    private TestResult createTestResult() {
        return new TestResult();
    }
}
