package com.testNG;

import org.testng.annotations.Test;

public class GroupinClass {
	@Test(groups = "Men")
	
	private void menSunglass() {
		
		System.out.println("Sunglass");
	}
	@Test(groups = "Men")
	
	private void menWallet() {
		
		System.out.println("Mens Wallet");
	}
	@Test(groups = "Men")
	
	private void mensPoloShirt() {
		
		System.out.println("PoloShirt");
	}
	@Test(groups = "Women")
	
	
	private void Foundation() {
		
		System.out.println("Women Foundation");
	}
	@Test(groups = "Women")
	
	private void Tonner() {
		
		System.out.println("Tonner");
	}
	@Test(groups = "Women")
	
	private void Moisturizer() {
		
		System.out.println("Women Moisturizer");
	}
	@Test(groups = "Kids")
	
	private void kidTowel() {
		
		
		System.out.println("Kids Towel");
	}
	@Test(groups = "Kids")
	
	private void kidsShoe() {
		
		System.out.println("Kids Shoe");
	}
	@Test(groups = "Kids")
	
	private void kidsSoap() {
		
		System.out.println("Kids Soap");
	}
	

}
