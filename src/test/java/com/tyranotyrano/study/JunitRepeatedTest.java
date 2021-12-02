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
    void testRepeatedTest1() {
        System.out.println("반복 테스트 실행");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    void testRepeatedTest2() {
        System.out.println("반복 테스트 실행");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
    void testRepeatedTest3() {
        System.out.println("디폴트 설정, 전체 반복 횟수와 현재 인덱스를 display name 으로 사용");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.CURRENT_REPETITION_PLACEHOLDER)
    void testRepeatedTest4() {
        System.out.println("전체 반복 횟수 중 현재 인덱스를 display name 으로 사용");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER)
    void testRepeatedTest5() {
        System.out.println("메소드 이름을 그대로 display name 으로 사용");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER)
    void testRepeatedTest6() {
        System.out.println("전체 횟수를 display name 으로 사용");
    }

    @RepeatedTest(value = 5, name = "custom display name")
    void testRepeatedTest7() {
        System.out.println("커스텀으로 반복 테스트 메소드의 이름 부여");
    }
}
