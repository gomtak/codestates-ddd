package com.codestatesddd.domain.user.service;

import com.codestatesddd.domain.user.entity.TeacherEntity;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public TeacherEntity saveTeacher(){
        //admin 확인 후
        System.out.println("강사저장");
        //save teacher
        return new TeacherEntity("영희");
    }
}
