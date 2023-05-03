package com.spicejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spicejet.pages.LoginPage;
import com.spicejet.utils.SpiceJetBaseTest;

public class LoginTest extends SpiceJetBaseTest {
	
	@Test
	public void login() {
		
		try {
			openBrowser("https://www.spicejet.com/");
			
			LoginPage el = PageFactory.initElements(driver, LoginPage.class);
			
			el.clickLoginButton();
			el.chooseEmail();
			el.enterEmailid("testing.learning@yahoo.com");
			el.enterPassword("Testing@123");
			el.clickLogin_final();
			Thread.sleep(3000);
			screenShot("Login");
			el.quitBrowser();
		}catch(Exception e) {
			System.out.println("Problem in testing login");
			e.printStackTrace();
		}
	}

}
