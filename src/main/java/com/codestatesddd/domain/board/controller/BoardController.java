package com.codestatesddd.domain.board.controller;

import com.codestatesddd.domain.board.service.BoardService;
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
    public Mono<ServerResponse> getBoardList(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(boardService.boardEntityList());
    }
}
