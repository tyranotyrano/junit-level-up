package com.tyranotyrano.study;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.tyranotyrano.domain.Month;

public class ParameterizedStudyTest {

	@DisplayName("ValueSource int 테스트")
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	void testValueSource1(int number) {
		// then
		assertThat(number).isGreaterThanOrEqualTo(0);
	}

	@DisplayName("ValueSource int 테스트")
	@ParameterizedTest
	@ValueSource(strings = {"a", "b", "c"})
	void testValueSource2(String str) {
		// then
		assertThat(str).isNotBlank();
	}

	@DisplayName("CsvSource 기본 구분자(,) 테스트")
	@ParameterizedTest
	@CsvSource({"1,1", "2,2", "3,3", "4,4"})
	void testCsvSource1(int n1, int n2) {
		// then
		assertEquals(n1, n2);
	}

	@DisplayName("CsvSource 커스텀 구분자 테스트")
	@ParameterizedTest
	@CsvSource(value = {"1:1", "2:2", "3:3", "4:4"}, delimiter = ':')
	void testCsvSource2(int n1, int n2) {
		// then
		assertEquals(n1, n2);
	}

	@DisplayName("NullSource 테스트")
	@ParameterizedTest
	@NullSource
	void testNullSource(String str) {
		// then
		assertNull(str);
	}

	@DisplayName("EmptySource 테스트")
	@ParameterizedTest
	@EmptySource
	void testEmptySource(String str) {
		// then
		assertThat(str).isEmpty();
	}

	@DisplayName("NullAndEmptySource 테스트")
	@ParameterizedTest
	@NullAndEmptySource
	void testNullAndEmptySource (String str) {
		// then
		assertThat(str).isBlank();
	}

	@DisplayName("EnumSource 테스트")
	@ParameterizedTest
	@EnumSource(value = Month.class)
	void testEnumSource(Month month) {
		// then
		assertTrue(Arrays.asList(Month.values()).contains(month));
	}
}
