package com.service;

import com.pojo.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    int addStuent(Student student);

    void deleteStudentById(long id);
    void updateStudent(Student stuent);

    int updateStuent(Student student);

    Student queryById(long id);
    List<Student> queryAllStudent();

}
