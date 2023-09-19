package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
	
WebDriver driver;
	
	public InformationPage(WebDriver driver){
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	public void enterFirstName(){
		
		firstName.sendKeys("TestFName");
	}
	
	public void enterLastName(){
		
		lastName.sendKeys("TestLName");
	}
	
	public void enterPostalCode(){
		
		postalCode.sendKeys("00000");
	}
	
	public void clickOnContinueBtn(){
		
		continueBtn.click();	
	}
	
	

}
