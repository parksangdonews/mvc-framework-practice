package com.ttp.mvcframework.order;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MenuTest {

    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환")
    @Test
    void chooseTest() {
        Menu menu = new Menu(
            List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 6000), new MenuItem("만두", 4000)));

        MenuItem menuItem = menu.choose("돈까스");

        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));

    }


    @DisplayName("메뉴 이름에 없는 메뉴를 선택시 예외발생")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(
            List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 6000), new MenuItem("만두", 4000)));

        assertThatCode(() -> menu.choose("짜장면")).isInstanceOf(IllegalArgumentException.class);

    }
}
