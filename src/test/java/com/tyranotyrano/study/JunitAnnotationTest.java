package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitAnnotationTest {

    private int a;
    private int b;

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
        a = 1;
        b = 2;
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @DisplayName("@beforeEach 테스트")
    @Test
    void testBeforeEach() {
        // then
        assertThat(b).isGreaterThanOrEqualTo(a);
    }

    @DisplayName("@beforeEach 테스트2")
    @Test
    void testBeforeEach2() {
        // given
        a = 2;

        // when & then
        assertThat(b).isEqualTo(a);
    }

    @DisplayName("@beforeEach 테스트3")
    @Test
    void testBeforeEach3() {
        // given
        a = 3;

        // when & then
        assertThat(b).isLessThanOrEqualTo(a);
    }
}
