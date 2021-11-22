package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

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
}
