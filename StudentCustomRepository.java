package com.example.spring_crud_application.customrepo;

import com.example.spring_crud_application.model.Student;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentCustomRepository {

    public List<Student> findStudentsByProperties(String name, String email, String subjectRef, String collegeRef, Student.Gender gender, Pageable page);
}
