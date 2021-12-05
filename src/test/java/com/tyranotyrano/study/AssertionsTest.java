package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

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

    @DisplayName("assertEquals 테스트")
    @Test
    void testAssertEquals() {
        // given
        int expected = 1;

        // when
        int actual = 1;

        // then
        assertEquals(actual, expected);
    }

    @DisplayName("isTrue 테스트")
    @Test
    void testIsTrue() {
        // when
        boolean actual = true;

        // then
        assertThat(actual).isTrue();
    }

    @DisplayName("isFalse 테스트")
    @Test
    void testIsFalse() {
        // when
        boolean actual = false;

        // then
        assertThat(actual).isFalse();
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

    @DisplayName("containsExactly 테스트")
    @Test
    void testContainsExactly() {
        // given
        int[] expectedArrays = {1, 2, 3, 4};

        // when
        int[] actualArrays = {1, 2, 3, 4};

        // then
        assertThat(actualArrays).containsExactly(expectedArrays);
    }

    @DisplayName("doesNotContain 테스트")
    @Test
    void testDoesNotContain() {
        // given
        int[] expectedArrays = {1, 2, 3, 4};

        // when
        int[] actualArrays = {5, 6, 7, 8};

        // then
        assertThat(actualArrays).doesNotContain(expectedArrays);
    }

    @DisplayName("hasSameSizeAs 테스트")
    @Test
    void testHasSameSizeAs() {
        // given
        int[] expectedArrays = {1, 2, 3, 4};

        // when
        int[] actualArrays = {5, 6, 7, 8};

        // then
        assertThat(actualArrays).hasSameSizeAs(expectedArrays);
    }

    @DisplayName("assertAll 테스트")
    @Test
    void testAssertAll() {
        // given
        int a = 1;
        int b = 2;

        // when & then
        assertAll(
            () -> assertThat(a).isEqualTo(1),
            () -> assertThat(b).isEqualTo(2)
        );
    }

    @DisplayName("assertNull 테스트")
    @Test
    void testAssertNull() {
        // given
        Object object = null;

        // when & then
        assertNull(object);
    }

    @DisplayName("assertNotNull 테스트")
    @Test
    void testAssertNotNull(){
        // given
        Object object = new Object();

        // when & then
        assertNotNull(object);
    }
}
