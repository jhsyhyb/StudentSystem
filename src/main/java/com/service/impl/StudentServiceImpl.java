package com.service.impl;

import com.pojo.Student;
import com.dao.StudentDao;
import com.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.Override;

@Service("studentService")
public  class StudentServiceImpl implements StudentService{
    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student){
        return studentDao.addStudent(student);
    }
    @Override
    public int deleteStudentById(long id){
        return studentDao.deleteStudentById(id);
    }


    @Override
    public int updateStudent(Student student){
        return studentDao.updateStudent(student);
    }
    @Override
    public Student queryById(long id) {
        return studentDao.queryById(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }
}