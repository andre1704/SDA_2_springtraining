package com.andre1704.repository;

import com.andre1704.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RENT on 2017-06-14.
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findOneByUuid(String uuid);
}
