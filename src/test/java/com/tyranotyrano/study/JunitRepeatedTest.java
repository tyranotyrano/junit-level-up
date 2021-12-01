package com.tyranotyrano.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class JunitRepeatedTest {

    @BeforeEach
    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();

        log.info(String.format("About to execute repetition %d of %d for %s",
                               currentRepetition,
                               totalRepetitions,
                               methodName));
    }

    @RepeatedTest(5)
    public void testRepeatedTest() {
        System.out.println("반복 테스트 실행");
    }
}
