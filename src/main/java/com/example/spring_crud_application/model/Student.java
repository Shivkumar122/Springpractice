package com.example.spring_crud_application.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

}
