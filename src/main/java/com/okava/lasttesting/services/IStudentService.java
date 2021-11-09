package com.okava.lasttesting.services;

import com.okava.lasttesting.models.Student;

import java.util.List;

public interface IStudentService {

    List<Student> all();

    Student create(Student student);
}
