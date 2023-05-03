package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SpiceJetBaseTest;

public class LoginPage extends SpiceJetBaseTest {

	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	public void clickLoginButton() {
		
		try {
			waitForElement(loginButton);
			clickAction(loginButton);
		}catch(Exception e) {
			System.out.println("Problem in clickLoginButton");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailRadioButton;
	
	public void chooseEmail() {
		
		try {
			waitForElement(emailRadioButton);
			clickAction(emailRadioButton);
		}catch(Exception e) {
			System.out.println("Problem in chooseEmail");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enterEmail;
	
	public void enterEmailid(String id) {
		
		try {
			waitForElement(enterEmail);
			sendText(enterEmail, id);
		}catch(Exception e) {
			System.out.println("Problem in enterEmailid");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement pswd;
	
	public void enterPassword(String pwd) {
		
		try {
			waitForElement(pswd);
			sendText(pswd, pwd);
		}catch(Exception e) {
			System.out.println("Problem in enterPassword");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//div[text()='LOGIN']")
    WebElement loginButton_final;
	
	public void clickLogin_final() {
		
		try {
			waitForElement(loginButton_final);
			actionClassClick(loginButton_final);
		}catch(Exception e) {
			System.out.println("Problem in clickLogin_final");
			e.printStackTrace();
		}
	}
}
