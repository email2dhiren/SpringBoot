package com.dhiren.annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	public void principalInfo() {
		System.out.println("Inside principalInfo method .....");
	}
}
