package com.ttp.mvcframework.calculator;

/**
 * <b>계산기</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/14/24
 */
public class Calculator {

    public static int calculate(int operand1, String operator, int operand2) {
        if ("+".equals(operator)) {
            return operand1 + operand2;
        }
        if ("-".equals(operator)) {
            return operand1 - operand2;
        }
        if ("*".equals(operator)) {
            return operand1 * operand2;
        }
        if ("/".equals(operator)) {
            if (operand2 == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return operand1 / operand2;
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
    }

}
