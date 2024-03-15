package com.ttp.mvcframework.gradeCalculator;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * <b></b>
 * <p>
 * 학점계산기 구현 요구사항 • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수 • MVC패턴(Model-View-Controller) 기반으로
 * 구현한다. • 일급 컬렉션 사용
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
class GradeCalculatorTest {

    // 학점계산기 도메인 :: 이수한 과목, 학점계산기
    // 객체지향프로그래밍, 자료구조, 중국어회화 >>> 과목(코스) 클래스
    // 이수한 과목을 전달하여 평균학점 요청 > 평균학점 계산기

    @Test
    void calculateAverageGradeTest() {

        List<Course> courses = List.of(
            new Course("OOP", 3, "B"),
            new Course("Data Structure", 3, "B"),
            new Course("Chinese Conversation", 2, "B")
        );
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double averageGrade = gradeCalculator.calculateAverageGrade();

        assertThat(averageGrade).isEqualTo(3.0);

    }
}