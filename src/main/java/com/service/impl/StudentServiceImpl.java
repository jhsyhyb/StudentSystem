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
    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
    }

    @Override
    public int addStuent(Student student){
        return studentDao.addStudent(student);
    }
    @Override
    public void deleteStudentById(long id){
        studentDao.deleteStudentById(id);
    }

    @Override
    public void updateStudent(Student stuent) {
    }

    @Override
    public int updateStuent(Student student){
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