package com.okava.lasttesting.services;

import com.okava.lasttesting.models.Student;
import com.okava.lasttesting.repositories.IStudentRepository;
import com.okava.lasttesting.services.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTests {

    @Mock
    private IStudentRepository studentRepository;

    @InjectMocks
    private StudentServiceImpl studentService;

    @Test
    public void testAllStudents() {
        when(studentRepository.findAll()).thenReturn(Arrays.asList(new Student(2L, "one", "two", "three"), new Student(2L, "one", "two", "three")));

        assertEquals(2,studentService.all().get(0).getId());
    }
}
