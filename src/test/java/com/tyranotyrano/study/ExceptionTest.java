package com.tyranotyrano.study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.tyranotyrano.utils.ExceptionGenerator;

public class ExceptionTest {

    @DisplayName("기본 Exception 테스트")
    @Test
    void testBasicException() {
        // then
        assertThatIllegalStateException().isThrownBy(ExceptionGenerator::throwIllegalStateException);
        assertThatIllegalArgumentException().isThrownBy(ExceptionGenerator::throwIllegalArgumentException);
    }

    @DisplayName("Exception 이 발생하지 않는 테스트")
    @Test
    void tesNoException() {
        // given & when
        int expected = 1;
        int actual = 1;
        // then
        assertThatNoException().isThrownBy(() -> assertThat(expected).isEqualTo(actual));
    }

    @DisplayName("메세지를 포함하는 Exception 테스트")
    @Test
    void testExceptionWithMessage() {
        // when & then
        assertThatIllegalStateException().isThrownBy(ExceptionGenerator::throwIllegalStateExceptionWithMessage)
                                         .withMessage("throw IllegalStateException");
    }
}
