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


    /**
     * 외부에 노출되는 인터페이스 역할
     * @param operand1
     * @param operator
     * @param operand2
     * @return
     */
    public static int calculation(int operand1, String operator, int operand2) {
        // operator에 해당하는 enum을 찾아서 해당 enum의 artimeticsCalculate 메소드를 호출
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
            .filter(value -> value.operator.equals(operator))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산자입니다."));

        return arithmeticOperator.artimeticsCalculate(operand1, operand2);
    }


    /**
     * 연산을 수행하는 메소드 / 추상 메소드
     * @param operand1
     * @param operand2
     * @return
     */
    protected abstract int artimeticsCalculate(final int operand1, final int operand2); // body


}
