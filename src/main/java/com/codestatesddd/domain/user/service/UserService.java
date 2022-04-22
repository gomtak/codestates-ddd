package com.codestatesddd.domain.user.service;

import com.codestatesddd.domain.user.entity.StudentEntity;
import com.codestatesddd.domain.user.entity.TeacherEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public StudentEntity saveStudent(){
        System.out.println("학생 저장");
        //유저 확인.
        return new StudentEntity();
    }
    public TeacherEntity saveTeacher(){
        //admin 확인 후
        System.out.println("강사저장");
        //save teacher
        return new TeacherEntity();
    }
}
