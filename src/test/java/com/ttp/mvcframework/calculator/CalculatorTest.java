package com.ttp.mvcframework.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <b>사칙연산</b>
 * <p>요구사항 </p>
 * <p>
 * • 간단한 사칙연산을 할 수 있다. • 양수로만 계산할 수 있다. • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다. •
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * </p>
 *
 * @author sangdo.park
 * @since 3/14/24
 */
@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {

    @DisplayName("덧셈") // 뺄셈 곱셈 나눗셈도 마찬가지 ~
    //@Test // Test or ParameterizedTest 중 하나만 쓰임.
    @ParameterizedTest // JUnit5의 ParameterizedTest
    @MethodSource("formularAndResult")
    void additionTest(int operand1, String operator, int operand2, int expected) {
        int result = Calculator.calculation(operand1, operator, operand2);
        assertThat(result).isEqualTo(expected);
    }

    private Stream<Arguments> formularAndResult() {
        return Stream.of(
            Arguments.of(1, "+", 2, 3),
            Arguments.of(1, "-", 2, -1),
            Arguments.of(1, "*", 2, 2),
            Arguments.of(4, "/", 2, 2)
        );
    }

    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.") // 뺄셈 곱셈 나눗셈도 마찬가지 ~
    @Test // JUnit5의 ParameterizedTest
    void calculateExceptionTest() {
        assertThatCode(() -> Calculator.calculation(1, "/", 0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Divide by zero");
    }
}
