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

    public static int calculation(int operand1, String operator, int operand2) {

        return ArithmeticOperator.calculation(operand1, operator, operand2);
        //throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
    }

}
