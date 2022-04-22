package com.codestatesddd.domain.course.entity;

public class CourseEntity {

    private int courseId;

    private String courseName;

    private String courseReview;

    private int courseScope;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseReview() {
        return courseReview;
    }

    public void setCourseReview(String courseReview) {
        this.courseReview = courseReview;
    }

    public int getCourseScope() {
        return courseScope;
    }

    public void setCourseScope(int courseScope) {
        this.courseScope = courseScope;
    }
}
