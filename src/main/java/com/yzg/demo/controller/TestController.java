package com.yzg.demo.controller;


import com.yzg.demo.model.entitiy.Student;
import com.yzg.demo.service.StudentNewService;
import com.yzg.demo.service.TeacherServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@Api("测试swagger的api")
@RequestMapping("/One")
public class TestController {
    @Autowired
    TeacherServiceImpl teacherimpl;

    @Autowired
    StudentNewService studentNewService;
    //直接获取模拟数据
    @GetMapping("/getStudent")
    @ApiOperation(value = "查询学生", notes = "xzxxxx")

    public List<Student> getStudent() throws ExecutionException, InterruptedException {
        return teacherimpl.getStudents().get();
    }

    // 用mybaits-plus从数据库中取数据
    @GetMapping("/getStudentByMybatisPlus")
    @ApiOperation(value = "查询学生", notes = "xzxxxx")

    public String getStudentByID() {
        return studentNewService.getItemTest();
    }


}