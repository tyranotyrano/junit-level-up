package com.tyranotyrano.myjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestResult {
    private static final Logger logger = LoggerFactory.getLogger(TestResult.class);
    private int runTestCount;

    public TestResult() {
        this.runTestCount = 0;
    }

    public synchronized void startTest() {
        this.runTestCount++;
    }

    public void printTestCount() {
        logger.info("Total Test Count: {}", runTestCount);
    }
}
