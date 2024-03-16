package com.ttp.mvcframework.order;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookTest {

    @DisplayName("요리 생성")
    @Test
    void name() {
        assertThatCode(() -> new Cook("만두", 5000)).doesNotThrowAnyException();
    }


}
