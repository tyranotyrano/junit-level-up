package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsTest {

    @DisplayName("isEqualTo 테스트")
    @Test
    void testIsEqualTo() {
        // given
        int expected = 1;

        // when
        int actual = 1;

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("isLessThanOrEqualTo 테스트")
    @Test
    void testIsLessThanOrEqualTo() {
        // given
        int expected = 2;

        // when
        int actual = 1;

        // then
        assertThat(actual).isLessThanOrEqualTo(expected);
    }

    @DisplayName("isGreaterThanOrEqualTo 테스트")
    @Test
    void testIsGreaterThanOrEqualTo() {
        // given
        int expected = 1;

        // when
        int actual = 2;

        // then
        assertThat(actual).isGreaterThanOrEqualTo(expected);
    }
}
