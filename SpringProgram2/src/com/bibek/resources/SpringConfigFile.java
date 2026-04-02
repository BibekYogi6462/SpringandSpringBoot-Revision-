package com.bibek.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bibek.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId1() {
		Student std = new Student();
		std.setName("Bibek");
		std.setRollno(1);
		std.setEmail("bibek@gmail.com");	
		return std;
	}

}
