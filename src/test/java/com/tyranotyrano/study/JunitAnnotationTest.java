package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitAnnotationTest {

    private int a;
    private int b;

    @BeforeEach
    void before() {
        a = 1;
        b = 2;
    }

    @DisplayName("@beforeEach 테스트")
    @Test
    void testBeforeEach() {
        // then
        assertThat(b).isGreaterThanOrEqualTo(a);
    }
}
