package com.andre1704.controller;

import com.andre1704.dto.TeacherDTO;
import com.andre1704.model.Teacher;
import com.andre1704.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by RENT on 2017-06-14.
 */
@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/create", method = POST)
    public Teacher create(@RequestBody TeacherDTO teacherDTO) {
        return teacherService.create(teacherDTO);
    }

    @RequestMapping(value = "/all", method = GET)
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }
}
