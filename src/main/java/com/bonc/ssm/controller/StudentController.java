package com.bonc.ssm.controller;

import com.bonc.ssm.entity.Student;
import com.bonc.ssm.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Today
 */
@RestController
@RequestMapping("/ssm")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/selectAll")
    public String selectAll(){
        System.out.println(studentMapper.selectAll());
        return "index";
    }
}
