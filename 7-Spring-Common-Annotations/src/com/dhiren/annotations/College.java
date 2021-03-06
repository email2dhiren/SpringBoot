package com.dhiren.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.dhiren.annotations")
public class College {
	@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	/*@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}*/
	
	/*public College(Principal principal) {

		this.principal = principal;
	}*/
	
	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My College Name is " + collegeName);
		System.out.println("Testing this college method.....");
	}


	
}
