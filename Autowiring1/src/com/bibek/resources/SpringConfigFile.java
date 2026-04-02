package com.bibek.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bibek.beans.Address;
import com.bibek.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Ktm");
		addr.setPincode(1);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Bibek");
		std.setRollno(02);
		std.setAddress(createAddrObj());
		return std;
	}
	

}
