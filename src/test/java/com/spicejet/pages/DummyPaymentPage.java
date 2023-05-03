package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SpiceJetBaseTest;

public class DummyPaymentPage extends SpiceJetBaseTest {
	
	 @FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
     WebElement fname;
     
     public void enterFirstName(String firstname) {
    	 waitForElement(fname);
    	 sendText(fname, firstname);
     }
     
     @FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
     WebElement lname;
     
     public void enterLastName(String lastname) {
    	 waitForElement(lname);
    	 sendText(lname, lastname);
     }
     
     @FindBy(xpath="//input[@data-testid='contact-number-input-box']")
     WebElement phone;
     
     public void enterPhoneNumber(String no) {
    	 waitForElement(phone);
    	 sendText(phone, no);
     }

     @FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
     WebElement email;
     
     public void enterEmail(String id) {
    	 waitForElement(email);
    	 sendText(email, id);
     }
     
     @FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
     WebElement city;
     
     public void enterCityName(String name) {
    	 waitForElement(city);
    	 sendText(city, name);
     }
	
     @FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
     WebElement checkbox;
     
     public void clickCheckBox() {
    	 waitForElement(checkbox);
    	 jsClick(checkbox);
     }
     
     @FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
     WebElement fnameofTravel;
     
     public void enterFirstNameTraveller(String fname) {
    	 waitForElement(fnameofTravel);
    	 sendText(fnameofTravel, fname);
     }
     
     @FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
     WebElement lnameofTravel;
     
     public void enterLastNameTraveller(String name) {
    	 waitForElement(lnameofTravel);
    	 sendText(lnameofTravel, name);
     }
     
     @FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
     WebElement phone1;
     
     public void enterPhoneNumberTraveller(String num) {
    	waitForElement(phone1);
    	sendText(phone1, num);
     }
     
     @FindBy(xpath="//div[text()='Continue']")
     WebElement continue1;
     
     public void clickContinueButton() {
    	 waitForElement(continue1);
    	 moveTo(continue1);
    	 actionClassClick(continue1);
     }
     
     @FindBy(xpath="(//span[text()='Skip this to skip comfort.'])[1]")
     WebElement skipSeat;
     
     public void clickSkipSeat() {
    	 waitForElement(skipSeat);
    	 clickAction(skipSeat);
     }
     
     @FindBy(xpath="(//div[text()='Continue'])[3]")
     WebElement continue3;
     
    @FindBy(xpath="//div[text()='Excess Baggage']")
    WebElement bagg;
     
     public void clickContinueButton2() {
    	 waitForElement(continue3);
    	 jsScrollUpToElement(bagg);
    	 jsClick(continue3);
    	
     }
       
     @FindBy(xpath="//iframe[@class='card_number_iframe']")
     WebElement frame1;
     
     @FindBy(id="card_number")
     WebElement cardNum;
     
     public void enterCardNumber(String num) {
    	 waitForElement(frame1);
    	 framesByWebElement(frame1);
    	 waitForElement(cardNum);
    	 sendText(cardNum, num);
     }
     
     @FindBy(xpath="//iframe[@class='name_on_card_iframe']")
     WebElement frame2;
  
     @FindBy(id="name_on_card")
     WebElement accHolder;
     
     public void enterAccHolderName(String name) {
    	 framesByDefault();
    	 waitForElement(frame2);
    	 framesByWebElement(frame2);
    	 waitForElement(accHolder);
    	 sendText(accHolder, name);
     }
     
     @FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
     WebElement frame3;
     
     @FindBy(id="card_exp_month")
     WebElement month;
     
     public void enterExpiryMonth(String num) {
    	 framesByDefault();
    	 waitForElement(frame3);
    	 framesByWebElement(frame3);
    	 waitForElement(month);
    	 sendText(month, num);
     }
     
     @FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
     WebElement frame4;
     
     @FindBy(id="card_exp_year")
     WebElement year;
     
     public void enterExpiryYear(String num) {
    	 framesByDefault();
    	 waitForElement(frame4);
    	 framesByWebElement(frame4);
    	 waitForElement(year);
    	 sendText(year, num);
     }
     
     @FindBy(xpath="//iframe[@class='security_code_iframe']")
     WebElement frame5;
   
     @FindBy(id="security_code")
     WebElement cvv;
     
     public void enterCVV(String num) {
    	 framesByDefault();
    	 waitForElement(frame5);
    	 framesByWebElement(frame5);
    	 waitForElement(cvv);
    	 sendText(cvv, num);
     }
     
     @FindBy(xpath="//div[text()='Proceed to pay']")
     WebElement pay;
     
     public void clickProceedToPay() {
    	 framesByDefault();
    	 waitForElement(pay);  
    	 jsScrollUpToElement(pay);
    	 actionClassClick(pay);
     }
     
     @FindBy(xpath="//div[text()='Invalid Card Details']")
 	WebElement invalid;
 	
 	public void validatePayment(String text) {
 		waitForElement(invalid);
 		validateText(invalid, text);
 		if(invalid.getText().contains(text)) {
 			System.out.println("Verification of Flight Booking : Due to invalid card details");
 		}
 		else
 			System.out.println("Verification Failed.");
 	}

}
