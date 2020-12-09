package com.atguigu.eduservice.controller;


import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 在mp中，service和mapper相应实现方法已经疯转完毕，即只需要专注写controller部分即可
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

    @Autowired
    EduTeacherService teacherService;

    /*
        查询所以讲师
     */
    @GetMapping
    public List<EduTeacher> getAllTeacher() {
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }


    /*
        删除讲师
        http://localhost:8011/eduservice/teacher/id
     */
    @DeleteMapping("{id}")
    public boolean deleteTeacherId(@PathVariable String id) {
        boolean flag = teacherService.removeById(id);
        return flag;
    }

}

