package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SpiceJetBaseTest;

public class OneWay_SearchFlightsPage extends SpiceJetBaseTest {
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement fromDest;
	
	public void chooseFromDestination(String text) {
		try {
			sendText(fromDest, text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement toDest;
	
	public void chooseToDestination(String text) {
		try {
			sendText(toDest, text);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

	@FindBy(xpath="(//div[text()='15'])[3]")
	WebElement departureDate;
	
	public void chooseDepartureDate() {
		try {
			waitForElement(departureDate);
			clickAction(departureDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement searchFlightButton;
	
	public void clickSearchFlight() {
		try {
			waitForElement(searchFlightButton);
			actionClassClick(searchFlightButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
