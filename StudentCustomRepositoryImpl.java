package com.example.spring_crud_application.customrepoimpl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring_crud_application.customrepo.StudentCustomRepository;
import com.example.spring_crud_application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class StudentCustomRepositoryImpl implements StudentCustomRepository {
    @Autowired
    MongoTemplate mongoTemplate;
    public List<Student> findStudentsByProperties(String name, String email, String subjectRef, String collegeRef, Student.Gender gender, Pageable page) {
        final Query query = new Query().with(page);
        query.fields().include("id").include("name");

        final List<Criteria> criteria = new ArrayList<>();
        if (name != null && !name.isEmpty())
            criteria.add(Criteria.where("name").is(name));
        if (email != null && !email.isEmpty())
            criteria.add(Criteria.where("email").is(email));
        if (subjectRef != null && !subjectRef.isEmpty())
            criteria.add(Criteria.where("subjectRefs").in(subjectRef));
        if (collegeRef != null && !collegeRef.isEmpty())
            criteria.add(Criteria.where("collegeRef").is(collegeRef));
        if (gender != null)
            criteria.add(Criteria.where("gender").is(gender));

        if (!criteria.isEmpty())
            query.addCriteria(new Criteria().andOperator(criteria.toArray(new Criteria[criteria.size()])));
        return mongoTemplate.find(query, Student.class);
    }
}
