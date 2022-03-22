package com.Hospital.Patient_Info.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:customConfig.properties" })
public class CustomPropertyConfiguration {
             //here  @Value bind  key to the value eg. it bind key "project.name" with the value comes under project_name
	@Value(value= "${project.name}")
	private String project_name ;

	@Value(value= "${project.description}")
	private String project_description ;
	
	
	public String getProject_name() {
		return project_name;
	}

	public String getProject_description() {
		return project_description;
	}

/*	@Bean
	public void getConfigured() {
		System.out.println(project_name);
		System.out.println(project_description);

			}
	*/
	
	// we can use @PropertSources annotation  to use multiple property config file by separating with "," because it is a array
	// we can use environment and Autowired this
	
}
