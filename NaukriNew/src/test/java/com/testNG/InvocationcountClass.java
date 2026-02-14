package com.testNG;

import org.testng.annotations.Test;

import com.reusablemethods.Baseclass;

public class InvocationcountClass extends Baseclass {
	@Test(invocationCount = 3)
	
	private void demo() {
		
		Browserlaunch("chrome");
		Gettingurl("https://www.instagram.com/");
		terminate();
	}

}
