package com.codestatesddd.domain.board.entity;

public class BoardEntity {

    private int boardId;
    private String boardTitle;
    private String boardContent;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public BoardEntity(String boardTitle, String boardContent) {
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }
}
