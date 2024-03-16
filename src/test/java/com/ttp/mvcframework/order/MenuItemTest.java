package com.ttp.mvcframework.order;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MenuItemTest {

    @DisplayName("메뉴 아이템 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new MenuItem("만두", 5000)).doesNotThrowAnyException();
    }
}
