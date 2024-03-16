package com.ttp.mvcframework.gradeCalculator;

import java.util.List;

/**
 * <b>학점 계산기</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 평균학점 계산
     *
     * @return
     */
    public double calculateAverageGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
