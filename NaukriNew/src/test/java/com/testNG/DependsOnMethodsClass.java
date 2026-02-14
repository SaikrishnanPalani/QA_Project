package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class DependsOnMethodsClass {
	@Test
	
	private void Physics() {
		
		System.out.println("Physics");
	}
	@Test
	
	private void Mathematics() {
		
	
		System.out.println("Mathematics");
	}
	@Test
	
	private void Botany() {
		String actname = "Hibiscus";
		String expname = "Hibiscuss";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actname, expname);
		//Assert.assertEquals(actname, expname);

		System.out.println("Botany");
		
	}
	@Test
	
	private void Zoology() {
		
		System.out.println("Zoology");
	}
	@Test(dependsOnMethods = {"Botany","Zoology"})
	
	private void Biology() {
		
		System.out.println("Biology");
	}
}
	
