package com.bibek.jpa1.service;

import com.bibek.jpa1.entities.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudentDetails(Student std);
    public List<Student> getAllStdDetails();

    public Student getStdDetails(long id);

    public boolean updateStdDetails(long id, float marks);

}
