package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SpiceJetBaseTest;

public class SelectFlightPage extends SpiceJetBaseTest{
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continueButton;
	
	public void clickContinueButton() {
		
		try {
			
			waitForElement(continueButton);
			actionClassClick(continueButton);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
