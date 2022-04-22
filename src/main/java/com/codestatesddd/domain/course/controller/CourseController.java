package com.codestatesddd.domain.course.controller;

import com.codestatesddd.domain.course.service.CourseService;
import com.codestatesddd.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.springframework.web.reactive.function.server.EntityResponse.fromObject;

@Component
public class CourseController {
    @Autowired
    CourseService courseService;
    public Mono<ServerResponse> saveCourse(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(courseService.saveCourse());
    }
    public Mono<ServerResponse> getCourse(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(courseService.getCourse());
    }
    public Mono<ServerResponse> getCourseLsit(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(fromObject(courseService.getCourseList()));
    }
    public Mono<ServerResponse> saveContents(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(courseService.saveContents());
    }
    public Mono<ServerResponse> saveEventInContents(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(courseService.saveEventInContents());
    }
    public Mono<ServerResponse> saveScope(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(courseService.saveScope());
    }
}
