package com.example.spring_crud_application.service;
import com.example.spring_crud_application.model.Student;
import com.example.spring_crud_application.repository.StudentRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> fetchStudentsByProperties(String name, String email, String subjectRef, String collegeRef,
                                                   Student.Gender gender, Integer page) {
        return studentRepository.findStudentsByProperties(name, email, subjectRef, collegeRef, gender,
                PageRequest.of(page, 15));
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
