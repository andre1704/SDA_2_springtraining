package com.andre1704.service.impl;

import com.andre1704.dto.TeacherDTO;
import com.andre1704.model.Teacher;
import com.andre1704.repository.TeacherRepository;
import com.andre1704.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by RENT on 2017-06-14.
 */
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findOne(String uuid) {
        return teacherRepository.findOneByUuid(uuid);
    }

    @Override
    public Teacher create(TeacherDTO teacherDTO) {
        Teacher newTeacher=new Teacher();
        newTeacher.setName(teacherDTO.getName());
        newTeacher.setSurname(teacherDTO.getSurname());
        newTeacher.setUuid(teacherDTO.getUuid().toString());
        return teacherRepository.save(newTeacher);
    }

}
