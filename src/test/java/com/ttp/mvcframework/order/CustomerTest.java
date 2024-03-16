package com.ttp.mvcframework.order;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <b>음식점 주문 과정</b>
 * <p>
 * 요구사항 도메인 구성 객체는 무엇인지 고민 - 손님 메뉴판 메뉴(돈까스냉면만두) 요리사 요리
 * <p>
 * 객체간 관계를 고민 손님 > 메뉴판 손님 > 요리사 요리사 > 요리 동적인 객체를 정적인 타입으로 추상화 >>  도메인 모델링 손님 > 손님타입 돈까스 냉면 만두 > 요리타입
 * 메뉴판 > 메뉴판 타입 메뉴 > 요리타입 요리 > 협력을 설계 객체 포괄 타입에 적절한 책임할당 구현
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
public class CustomerTest {

    @DisplayName("주문 테스트")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 6000), new MenuItem("만두", 7000)));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("만두", menu, cooking)).doesNotThrowAnyException();

    }


}
