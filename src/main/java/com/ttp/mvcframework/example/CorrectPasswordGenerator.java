package com.ttp.mvcframework.example;

/**
 * <b>정상패스워드 생성</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/14/24
 */
public class CorrectPasswordGenerator implements PasswordGeneratePolicy {

    @Override
    public String generatePassword() {
        return "12345678";
    }
}
