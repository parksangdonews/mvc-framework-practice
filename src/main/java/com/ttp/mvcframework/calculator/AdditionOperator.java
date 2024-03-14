package com.ttp.mvcframework.calculator;

/**
 * <b></b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/15/24
 */
public class AdditionOperator implements NewArithmeticOperator {

    @Override
    public boolean support(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }

}
