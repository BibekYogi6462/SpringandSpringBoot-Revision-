package com.bibek.jpa1;

import com.bibek.jpa1.entities.Student;
import com.bibek.jpa1.service.StudentService;
import com.bibek.jpa1.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Jpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Jpa1Application.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);

		//Insert Operation
//		Student std = new Student();
//		std.setName("Bibek");
//		std.setRollno(101);
//		std.setMarks(85.5f);
//		boolean status = stdService.addStudentDetails(std);
//		if(status) {
//			System.out.println("Student details added successfully");
//		} else {
//			System.out.println("Failed to add student details");
//		}


		//Select Operation
//		List<Student> stdList = stdService.getAllStdDetails();
//		for(Student s : stdList) {
//			System.out.println("ID: " + s.getId());
//			System.out.println("Name: " + s.getName());
//			System.out.println("Roll No: " + s.getRollno());
//			System.out.println("Marks: " + s.getMarks());
//			System.out.println("-----------------------------");
//		}


//		Student std = stdService.getStdDetails(1L);
//		if (std != null) {
//			System.out.println("ID: " + std.getId());
//			System.out.println("Name: " + std.getName());
//			System.out.println("Roll No: " + std.getRollno());
//			System.out.println("Marks: " + std.getMarks());
//		} else {
//			System.out.println("Student not found with ID 1");
//		}


		boolean status = stdService.updateStdDetails(1L, 90.0f);
		if(status) {
			System.out.println("Student details updated successfully");
		} else {
			System.out.println("Failed to update student details");
		}


	}

}
