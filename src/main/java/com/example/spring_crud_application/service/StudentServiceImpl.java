package com.example.spring_crud_application.service;
import com.example.spring_crud_application.model.Student;
import com.example.spring_crud_application.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
//
//    @Override
//    public List<Student> getAllStudent() {
//        return studentRepository.findAll();
//    }
//
//    @Override
//    public Student getStudentById(String id) {
//        return studentRepository.findById(id).get();
//    }
//
//
//    @Override
//    public void delete(String id) {
//        studentRepository.deleteById(id);
//    }
}
