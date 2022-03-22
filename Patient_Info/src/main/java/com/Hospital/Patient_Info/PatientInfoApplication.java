package com.Hospital.Patient_Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.Hospital.Patient_Info.Configuration.CustomPropertyConfiguration;
@EntityScan(basePackages={"com.Hospital.Patient_Info.Entity"})
@SpringBootApplication
public class PatientInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientInfoApplication.class, args);
	//	ConfigurableApplicationContext  configAppContext =
//	CustomPropertyConfiguration cpc =	configAppContext.getBean(CustomPropertyConfiguration.class);
	//    cpc.getConfigured();
	    
	}

}
