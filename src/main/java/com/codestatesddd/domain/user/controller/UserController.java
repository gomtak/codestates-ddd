package com.codestatesddd.domain.user.controller;


import com.codestatesddd.domain.user.service.StudentService;
import com.codestatesddd.domain.user.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserController {

    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    public Mono<ServerResponse> saveStudent(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(studentService.saveStudent());
    }
    public Mono<ServerResponse> saveTeacher(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(teacherService.saveTeacher());
    }
}
