package com.example.spring_crud_application.service;

import com.example.spring_crud_application.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> fetchStudentsByProperties(String name, String email, String subjectRef, String collegeRef,
                                                   Student.Gender gender, Integer page);

//    public List<Student> getAllStudent();
//
//    public Student getStudentById(String id);
//
//    public void delete(String id);

}
