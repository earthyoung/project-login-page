package com.example.examplewebproject.controller;

import com.example.examplewebproject.dto.StudentDto;
import com.example.examplewebproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RestController {

    private final StudentRepository studentRepository;

    @GetMapping("/get")
    public List<StudentDto> findAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/post")
    public StudentDto signUp(){
        final StudentDto student = StudentDto.builder()
                .id(2018220829)
                .name("Liman")
                .grade("B+")
                .departmentId(2208)
                .registered("NO")
                .build();
        return studentRepository.save(student);
    }

}
