package com.msr.edu.controller;


import com.msr.edu.entity.Teacher;
import com.msr.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zjc
 * @since 2020-06-07
 * PostMapping  添加
 * PutMapping  修改
 */
@RestController //满足restful风格 把CRUD的方法用语义化的方式来展示，返回类型为json格式
@RequestMapping("/edu/teacher") //请求路径访问
@CrossOrigin //跨域
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/list")
    public List<Teacher> list(){
        return teacherService.list(null);
    }


}

