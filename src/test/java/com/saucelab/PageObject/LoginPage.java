package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	public void enterUsername(){
		username.sendKeys("standard_user");
	}
	public void enterPassword(){
		password.sendKeys("secret_sauce");
	}
	public void clickOnLoginBtn(){
		login.click();
	}
	

}
