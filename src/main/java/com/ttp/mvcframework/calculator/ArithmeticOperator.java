package com.ttp.mvcframework.calculator;

import java.util.Arrays;

/**
 * <b>연산 오퍼레이터 enum</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/14/24
 */
public enum ArithmeticOperator {

    ADD("+") {
        @Override
        public int artimeticsCalculate(int x, int y) {
            return x + y;
        }
    }, SUB("-") {
        @Override
        public int artimeticsCalculate(int x, int y) {
            return x - y;
        }
    }, MUL("*") {
        @Override
        public int artimeticsCalculate(int x, int y) {
            return x * y;
        }
    }, DIV("/") {
        @Override
        public int artimeticsCalculate(int x, int y) {
            return x / y;
        }
    };

    // enum element
    private final String operator;

    ArithmeticOperator(final String operator) { // 생성자
        this.operator = operator;
    }

    public static int calculation(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
            .filter(value -> value.operator.equals(operator))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산자입니다."));

        return arithmeticOperator.artimeticsCalculate(operand1, operand2);
    }

    public abstract int artimeticsCalculate(final int operand1, final int operand2); // body


}
