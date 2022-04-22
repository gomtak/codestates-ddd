package com.codestatesddd.domain.course.entity;

public class ContentsEntity {

    private int courseId;
    private int contentsId;
    private String contents;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getContentsId() {
        return contentsId;
    }

    public void setContentsId(int contentsId) {
        this.contentsId = contentsId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
