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
}
