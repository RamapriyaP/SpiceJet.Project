package com.spicejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spicejet.pages.SignUpPage;
import com.spicejet.utils.SpiceJetBaseTest;

public class SignUpTest extends SpiceJetBaseTest {

	@Test
	public void signUp() {
		
		try {
			openBrowser("https://www.spicejet.com/");
			SignUpPage ele = PageFactory.initElements(driver, SignUpPage.class);
			ele.clickSignUpButton();
			windowHandling();
			
			ele.enterPhoneNumber("9876543211");
			ele.enterEmail("testing.learning@yahoo.com");
			ele.setPassword("Testing@123");
			ele.confirmPassword("Testing@123");
			
			ele.selectDDOptions("Ms");
			ele.enterFirstName("Priya");
			ele.enterLastName("P");
			ele.chooseCountry("IN");
			ele.clickDOB();
			ele.selectYear("2000");
			ele.selectMonth("April");
			ele.clickDate("20");
			
			ele.clickCheckBox();
			ele.clickSubmitButton();
			
			ele.quitBrowser();
			
			
		}catch(Exception e) {
			System.out.println("Problem in testing signUp");
			e.printStackTrace();
		}
	}
}
