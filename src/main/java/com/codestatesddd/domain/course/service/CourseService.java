package com.codestatesddd.domain.course.service;

import com.codestatesddd.domain.course.entity.ContentsEntity;
import com.codestatesddd.domain.course.entity.CourseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    // 강좌 생성 : 관리자
    public CourseEntity saveCourse(){
        System.out.println("강좌 개설");
        return new CourseEntity();
    }
    // 강의 열람 : 학생
    public CourseEntity getCourse(){
        System.out.println("강좌 조회");
        return new CourseEntity();
    }
    // 수강 강좌 리스트 조회 : 학생
    public List<CourseEntity> getCourseList(){
        System.out.println("강좌 리스트 조회");
        return new ArrayList<>();
    }

}
