package com.ttp.mvcframework.gradeCalculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <b></b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
class CourseTest {

    @DisplayName("과목 생성")
    @Test
    void createCourse() {
        assertThatCode(() -> {
            new Course("OOP", 3, "A");
        }).doesNotThrowAnyException();
    }

}