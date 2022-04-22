package com.codestatesddd.domain.board.entity;

public class CommentEntity {
    private int commentId;
    private int boardId;
    private String comment;

    public CommentEntity(int commentId, int boardId, String comment) {
        this.commentId = commentId;
        this.boardId = boardId;
        this.comment = comment;
    }
}
