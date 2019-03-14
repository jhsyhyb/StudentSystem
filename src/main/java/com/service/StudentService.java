package com.service;

import com.pojo.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);

    int deleteStudentById(long id);

    int updateStudent(Student student);

    Student queryById(long id);
    List<Student> queryAllStudent();

}
