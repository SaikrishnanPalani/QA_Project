package com.testNG;

import org.testng.annotations.Test;

public class PriorityClass {
	
	@Test(priority = -1)
	
	private void Login() {
		
		System.out.println("Login");
		
	}
	@Test(priority = 1)
	private void SearchPage() {
		
		System.out.println("Sesrch Page");
	}
	@Test(priority = 2)
	private void PaymentPage() {
		
		System.out.println("Paymentpage");
	}
	@Test(priority = 3)
	private void CheckoutPage() {
		
		System.out.println("Checkout");
	}
}
