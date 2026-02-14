package com.listner;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.reusablemethods.Baseclass;

public class ExtentReport_Test {
	
	public static ExtentTest extenttest;
	
	public void extentTestReportStartip() {
		
		Baseclass base = new Baseclass() {	
		};
		base.extentReportStart(null);
		
	}

	public void extentReportEnd() throws IOException {
		
		Baseclass base = new Baseclass() {
		};
		base.extentReportTearDown(null);
	}
}
