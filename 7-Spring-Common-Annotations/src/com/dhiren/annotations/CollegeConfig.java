package com.dhiren.annotations;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.dhiren.annotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	/*
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal pricipalBean() {
		return new Principal();
	}
	@Bean
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(pricipalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}*/
	
}
