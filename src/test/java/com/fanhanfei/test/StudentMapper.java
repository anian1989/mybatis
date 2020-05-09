package com.fanhanfei.test;

import com.fanhanfei.test.entity.StudentEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangjunshuai
 * @date 2020/4/29
 * @description
 **/
public interface StudentMapper {

    StudentEntity getStudentById(int id);

    int addStudent(StudentEntity student);

    int updateStudentName(@Param("name") String name, @Param("id") int id);

    StudentEntity getStudentByIdWithClassInfo(int id);
}