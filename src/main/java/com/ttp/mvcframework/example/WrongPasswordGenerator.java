package com.ttp.mvcframework.example;

/**
 * <b>비정상패스워드 생성</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/14/24
 */
public class WrongPasswordGenerator implements PasswordGeneratePolicy {

    @Override
    public String generatePassword() {
        return "zero1234567890";
    }
}
