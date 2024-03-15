package com.ttp.mvcframework.gradeCalculator;

import java.util.List;

/**
 * <b>1급객체 샘플</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 점수합산
     *
     * @return 학점수 * 평점의 합계
     */
    public double multiplyCreditAndCourseGrade() {
        double multiplyCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multiplyCreditAndCourseGrade += course.mulitplyCreditAndCourseGrade(); // 학점수 * 평점 // 멀티플 동작을 위해 메소드 생성
        }
        return multiplyCreditAndCourseGrade;
    }

    /**
     * 수강신청 학점수
     *
     * @return 수강신청 총학점 수
     */
    public int calculateTotalCompletedCredit() {
        return courses.stream().mapToInt(Course::getCredit).sum();
    }


}
