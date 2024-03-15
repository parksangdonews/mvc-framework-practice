package com.ttp.mvcframework.gradeCalculator;

import lombok.Getter;

/**
 * <b>과목 ( 코스 )</b>
 * <p>
 *
 * </p>
 *
 * @author sangdo.park
 * @since 3/16/24
 */
@Getter
public class Course {

    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double getGradePoint() {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                throw new IllegalArgumentException("잘못된 학점입니다.");
        }
    }

    public double mulitplyCreditAndCourseGrade() {
        return getGradePoint() * credit;
    }
}
