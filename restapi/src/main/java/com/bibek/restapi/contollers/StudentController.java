package com.bibek.restapi.contollers;

import com.bibek.restapi.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Bibek", "Shrestha");
    }


    //List of
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bibek", "Shrestha"));
        students.add(new Student("Suman", "Shrestha"));
        students.add(new Student("Sujan", "Shrestha"));
        return students;
    }


//PathVariable
    @GetMapping("{fistName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName")String lastName) {
        return new Student(firstName, lastName);
    }


    //RequestParam or QueryPramater
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
                                     @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }


}
