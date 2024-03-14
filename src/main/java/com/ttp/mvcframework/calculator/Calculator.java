package com.ttp.mvcframework.calculator;

import java.util.List;

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

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
        new AdditionOperator(),
        new SubstractionOperator(),
        new MultiplicationOperator(),
        new DivisionOperator()
    );

    public static int calculation(int operand1, String operator, int operand2) {

        //return ArithmeticOperator.calculation(operand1, operator, operand2);
        //throw new IllegalArgumentException("지원하지 않는 연산자입니다.");

        return arithmeticOperators.stream()
            .filter(arithmeticOperator -> arithmeticOperator.support(operator))
            .findFirst()
            .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
            .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산자입니다."));

    }

}
