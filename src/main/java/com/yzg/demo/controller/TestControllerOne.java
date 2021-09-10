package com.yzg.demo.controller;


import com.yzg.demo.model.Student;
import com.yzg.demo.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yzg.demo.service.TeacherServiceImpl;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/One")
public class TestControllerOne {
    @Autowired
    TeacherServiceImpl teacherimpl;

    @GetMapping("/getStudent")
    public List<Student> getStudent() throws ExecutionException, InterruptedException {
        return teacherimpl.getStudents().get();
    }

}