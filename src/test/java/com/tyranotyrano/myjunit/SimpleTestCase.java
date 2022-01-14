package com.tyranotyrano.myjunit;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTestCase extends TestCase {
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    public SimpleTestCase(String testCaseName) {
        super(testCaseName);
    }

    public void runTest() {
        System.out.println("SimpleTestCase 테스트 성공!");
    }

    @Override
    protected void before() {
        logger.info("{} before overriding", testCaseName);
    }

    @Override
    protected void after() {
        logger.info("{} after overriding", testCaseName);
    }
}
