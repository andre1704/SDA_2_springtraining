package com.andre1704.service;

import com.andre1704.dto.TeacherDTO;
import com.andre1704.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by RENT on 2017-06-14.
 */
@Service
public interface TeacherService {
    List<Teacher> findAll();
    Teacher findOne(String uuid);
    Teacher create(TeacherDTO teacherDTO);
}
