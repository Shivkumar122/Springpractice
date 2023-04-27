package com.example.spring_crud_application.repository;

import com.example.spring_crud_application.customrepo.StudentCustomRepository;
import com.example.spring_crud_application.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository <Student, String>, StudentCustomRepository {

}
