package com.codestatesddd.domain.board.entity;

public class CommentEntity {
    private int commentId;
    private int boardId;
    private String comment;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentEntity(int commentId, int boardId, String comment) {
        this.commentId = commentId;
        this.boardId = boardId;
        this.comment = comment;
    }
}
