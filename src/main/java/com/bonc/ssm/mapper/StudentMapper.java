package com.bonc.ssm.mapper;

import com.bonc.ssm.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Today
 */
@Mapper
public interface StudentMapper {
    List<Student> selectAll();
}
