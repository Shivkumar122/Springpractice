package com.example.spring_crud_application.controller;

import com.example.spring_crud_application.service.StudentService;
import com.example.spring_crud_application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/req")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

//    @GetMapping("/getStudent")
//    public List<Student> getAllStudent() {
//        return studentService.getAllStudent();
//
//    }
//
//    @GetMapping("/{std}")
//    public Student getStudentById(@PathVariable String std) {
//        return studentService.getStudentById(std);
//
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteStudentById(@PathVariable("id") String id) {
//        studentService.delete(id);
//    }

}
