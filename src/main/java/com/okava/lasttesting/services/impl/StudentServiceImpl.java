package com.okava.lasttesting.services.impl;

import com.okava.lasttesting.models.Student;
import com.okava.lasttesting.repositories.IStudentRepository;
import com.okava.lasttesting.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> all() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
