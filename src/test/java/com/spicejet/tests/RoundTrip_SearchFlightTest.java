package com.spicejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spicejet.pages.RoundTrip_SearchFlightsPage;

public class RoundTrip_SearchFlightTest extends RoundTrip_SearchFlightsPage{
	
	@Test
	public void roundtripSearchFlight() {
		
		try {
			
			openBrowser("https://www.spicejet.com/");
			
			RoundTrip_SearchFlightsPage element = PageFactory.initElements(driver, RoundTrip_SearchFlightsPage.class);
			
			element.clickRoundTrip();
			element.chooseFromDestination("Chennai");
			element.chooseToDestination("Delhi");
			element.chooseDepartureDate();
			element.chooseReturndate();
			element.clickSearchFlight();
			
		}catch(Exception e) {
			System.out.println("Problem in searching flight for round trip");
			e.printStackTrace();
		}
	}

}
