package com.spicejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spicejet.pages.DummyPaymentPage;
import com.spicejet.pages.SelectFlightPage;
import com.spicejet.utils.SpiceJetBaseTest;

public class DummyPaymentTest extends SpiceJetBaseTest{
	
	@Test
	public void dummypayment() {
	
	try {
		openBrowser("https://www.spicejet.com/");
		
		RoundTrip_SearchFlightTest el = PageFactory.initElements(driver, RoundTrip_SearchFlightTest.class);
		el.clickRoundTrip();
		el.chooseFromDestination("Chennai");
		el.chooseToDestination("Delhi");
		el.chooseDepartureDate();
		el.chooseReturndate();
		el.clickSearchFlight();
		
		SelectFlightPage ele =PageFactory.initElements(driver, SelectFlightPage.class);
		ele.clickContinueButton();
		
		DummyPaymentPage elem = PageFactory.initElements(driver, DummyPaymentPage.class);
		elem.enterFirstName("Priya");
		elem.enterLastName("Prasath");
		elem.enterPhoneNumber("9876543210");
		elem.enterEmail("testing.learning@yahoo.com");
		elem.enterCityName("Chennai");
		elem.clickCheckBox();
		elem.enterFirstNameTraveller("Priya");
		elem.enterLastNameTraveller("P");
		elem.enterPhoneNumberTraveller("9876543210");
		elem.clickContinueButton();
		elem.clickContinueButton2();
		elem.clickSkipSeat();
		elem.enterCardNumber("1654987552145248");
		elem.enterAccHolderName("ABC");
		elem.enterExpiryMonth("May");
		elem.enterExpiryYear("2025");
		elem.enterCVV("123");
		elem.clickProceedToPay();
		Thread.sleep(5000);
		screenShot("DummyPay");
		elem.validatePayment("Invalid payment");
		
		elem.quitBrowser();
		

		
		
		
	} catch (Exception e) {
		System.out.println("Problem in testing for dummy payment ");
		e.printStackTrace();
	}

}
	
}	
