package com.codestatesddd.domain.user.entity;

public class StudentEntity {

    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudentEntity(String studentName) {
        this.studentName = studentName;
    }
}
