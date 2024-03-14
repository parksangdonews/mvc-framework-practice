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
public interface NewArithmeticOperator {
    boolean support(String operator);
    int calculate(int operand1, int operand2);

}
