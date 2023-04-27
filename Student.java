package com.example.spring_crud_application.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private String city;
    private List<String> subjectRefs;
    private String collegeRef;
    private String email;
    private Gender gender;

    public enum Gender {

    }

}
