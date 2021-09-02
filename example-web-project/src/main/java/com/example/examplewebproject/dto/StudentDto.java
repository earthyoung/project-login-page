package com.example.examplewebproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity(name="students")
public class StudentDto {

    @Id
    @Column(name="ID")
    private int id;

    @Column
    private String name;

    @Column
    private String grade;

    @Column(name="department_id")
    private int departmentId;

    @Column
    private String registered;

}
