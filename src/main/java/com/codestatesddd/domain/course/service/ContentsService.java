package com.codestatesddd.domain.course.service;

import com.codestatesddd.domain.course.entity.ContentsEntity;
import org.springframework.stereotype.Service;

@Service
public class ContentsService {
    //    강좌에 강의 등록 : 강사
    public ContentsEntity saveContents(){
        System.out.println("컨텐츠 등록");
        return new ContentsEntity();
    }
    //    강좌에 시험 등록 : 강사
    public ContentsEntity saveEventInContents(){
        System.out.println("컨텐츠 이벤트 등록");
        return new ContentsEntity();
    }
    //    강의 별점
    public ContentsEntity saveScope(){
        System.out.println("컨텐츠 별점 등록");
        return new ContentsEntity();
    }
}
