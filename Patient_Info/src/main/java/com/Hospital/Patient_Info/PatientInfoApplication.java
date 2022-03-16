package com.Hospital.Patient_Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages={"com.Hospital.Patient_Info.Entity"})
@SpringBootApplication
public class PatientInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientInfoApplication.class, args);
	}

}
