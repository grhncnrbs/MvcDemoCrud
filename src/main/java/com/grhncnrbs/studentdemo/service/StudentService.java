package com.grhncnrbs.studentdemo.service;

import com.grhncnrbs.studentdemo.entity.Student;

import java.util.List;

public interface StudentService {

    Student getById(Long id);
    List<Student> getAll();
    Student save(Student student);
    Student update(Student student);
    void delete(Long id);


}
