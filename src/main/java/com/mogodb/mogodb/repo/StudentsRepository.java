package com.mogodb.mogodb.repo;

import com.mogodb.mogodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Student,String> {
}
