package com.spicejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spicejet.pages.OneWay_SearchFlightsPage;

public class OneWay_SearchFlightsTest extends OneWay_SearchFlightsPage {
	
	@Test
	public void onewaySearchFlight() {
		
		try {
			
			openBrowser("https://www.spicejet.com/");
			
			OneWay_SearchFlightsPage element = PageFactory.initElements(driver, OneWay_SearchFlightsPage.class);
			
			element.chooseFromDestination("Chennai");
			element.chooseToDestination("Delhi");
			element.chooseDepartureDate();
			element.clickSearchFlight();
			
		}catch(Exception e) {
			System.out.println("Problem in searching flight for one way");
			e.printStackTrace();
		}
	}

}
