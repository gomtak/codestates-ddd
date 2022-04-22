package com.codestatesddd.config;

import com.codestatesddd.domain.board.controller.BoardController;
import com.codestatesddd.domain.course.controller.CourseController;
import com.codestatesddd.domain.user.controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routes(BoardController boardController) {
        return RouterFunctions
                .route(GET("/boards"), boardController::getBoardList) // 게시글 목록 조회
                .andRoute(POST("/boards"), boardController::saveBoard) // 게시글 등록
                .andRoute(GET("/boards/{id}"), boardController::getBoard) // 게시글 조회
                .andRoute(DELETE("/boards/{id}"), boardController::deleteBoard) // 게시글 삭제
                .andRoute(POST("/boards/{id}/comments"), boardController::saveComment) // 댓글 등록
                .andRoute(GET("/boards/{id}/comments"), boardController::getComment) // 댓글 목록 조회
                .andRoute(DELETE("/boards/{id}/comments/{commentId}"), boardController::deleteComment) // 댓글 삭제
                ;
    }
    @Bean
    public RouterFunction<ServerResponse> routes(CourseController courseController) {
        return RouterFunctions
                .route(GET("/course"), courseController::getCourseLsit) // 강좌 목록 조회
                .andRoute(POST("/course"), courseController::saveCourse) // 강좌 등록
                .andRoute(GET("/course/{id}"), courseController::getCourse) // 강좌 상세 조회
                .andRoute(POST("/course/contents"), courseController::saveContents) //강좌 강의 등록
                .andRoute(POST("/course/contents/{id}/event"), courseController::saveEventInContents) //강좌 시험 등록
                .andRoute(POST("/course/contents/{id}/scope"), courseController::saveScope) // 강좌 강의 평가.
                ;
    }
    @Bean
    public RouterFunction<ServerResponse> routes(UserController userController) {
        return RouterFunctions
                .route(POST("/user/student"), userController::saveStudent)
                .andRoute(POST("/user/teacher"), userController::saveTeacher)
                ;
    }
}
