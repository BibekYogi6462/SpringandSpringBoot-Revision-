package com.bibek.jpa1.repository;

import com.bibek.jpa1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
