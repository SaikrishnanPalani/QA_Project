package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.reusablemethods.Baseclass;

public class CrossBrowser extends Baseclass {
	@Test
	@SuppressWarnings({ "deprecation" })
	private void Chrome() {
		
		Browserlaunch("chrome");
		Gettingurl("https://www.facebook.com/");
		System.out.println("BrowserId:"+Thread.currentThread().getId());
		
	}
	@Ignore
	@Test
	@SuppressWarnings({ "deprecation" })
	private void Edge() {
		Browserlaunch("edge");
		Gettingurl("https://www.facebook.com/");
		System.out.println("BrowserId:"+Thread.currentThread().getId());
	}
	@Test
	@SuppressWarnings({ "deprecation" })
	private void FireFox() {
		
		Browserlaunch("firefox");
		Gettingurl("https://www.facebook.com/");
		System.out.println("BrowserId:"+Thread.currentThread().getId());
		
	}

}
