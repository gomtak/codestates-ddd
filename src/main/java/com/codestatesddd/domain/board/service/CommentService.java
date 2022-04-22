package com.codestatesddd.domain.board.service;

import com.codestatesddd.domain.board.entity.CommentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    public CommentEntity saveComment() {
        System.out.println("댓글 쓰기");
        return new CommentEntity(0,0,"test comment");
    }
    public List<CommentEntity> getComment(){
        System.out.println("댓글 읽기");
        return new ArrayList<>();
    }
    public int deleteComment(){
        System.out.println("댓글 삭제");
        return 0;
    }
}
