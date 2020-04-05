package com.dhiren.annotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi, I Lakshmi Singh is your Science Teacher");

	}

}
