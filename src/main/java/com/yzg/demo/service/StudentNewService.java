package com.yzg.demo.service;

import com.yzg.demo.mapper.students.StudentNewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentNewService {

    @Autowired
    StudentNewMapper studentNewMapper;

    public String getItemTest(){
        return  studentNewMapper.selectById(1).toString();
    }


}
