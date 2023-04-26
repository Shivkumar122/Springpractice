package com.example.spring_crud_application.repository;

import com.example.spring_crud_application.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository <Student, String>{

}
