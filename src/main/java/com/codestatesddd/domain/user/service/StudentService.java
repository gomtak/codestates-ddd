package com.codestatesddd.domain.user.service;

import com.codestatesddd.domain.user.entity.StudentEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentEntity saveStudent(){
        System.out.println("학생 저장");
        //유저 확인.
        return new StudentEntity();
    }
}
