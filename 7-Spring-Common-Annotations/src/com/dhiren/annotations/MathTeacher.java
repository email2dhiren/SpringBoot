package com.dhiren.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi, I Dhirendra Singh is your Maths Teacher");

	}

}
