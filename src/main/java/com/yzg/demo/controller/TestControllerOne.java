package com.yzg.demo.controller;


import com.yzg.demo.model.Student;
import com.yzg.demo.service.TeacherServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yzg.demo.service.TeacherServiceImpl;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@Api("测试swagger的api")
@RequestMapping("/One")
public class TestControllerOne {
    @Autowired
    TeacherServiceImpl teacherimpl;

    @GetMapping("/getStudent")
    @ApiOperation(value = "查询学生", notes = "xzxxxx")

    public List<Student> getStudent() throws ExecutionException, InterruptedException {
        return teacherimpl.getStudents().get();
    }

}