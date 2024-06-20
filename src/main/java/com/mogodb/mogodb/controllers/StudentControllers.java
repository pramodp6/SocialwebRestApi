package com.mogodb.mogodb.controllers;


import com.mogodb.mogodb.model.Student;
import com.mogodb.mogodb.repo.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/student")
public class StudentControllers {
    @Autowired
    private StudentsRepository studentsRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
      Student save=  this.studentsRepository.save(student);
      return ResponseEntity.ok(save);
    }
}
