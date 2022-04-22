package com.codestatesddd.domain.board.controller;

import com.codestatesddd.domain.board.service.BoardService;
import com.codestatesddd.domain.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class BoardController {

    @Autowired
    BoardService boardService;
    @Autowired
    CommentService commentService;
    /**게시글**/
    public Mono<ServerResponse> getBoardList(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(boardService.getBoardList());
    }
    public Mono<ServerResponse> getBoard(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(boardService.getBoard());
    }
    public Mono<ServerResponse> saveBoard(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(boardService.saveBoard());
    }
    public Mono<ServerResponse> deleteBoard(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(boardService.deleteBoard());
    }

    /**댓글**/
    public Mono<ServerResponse> getComment(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(commentService.getComment());
    }
    public Mono<ServerResponse> saveComment(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(commentService.saveComment());
    }
    public Mono<ServerResponse> deleteComment(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(commentService.deleteComment());
    }
}
