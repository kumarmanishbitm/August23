package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver){
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartIcon;
	
	@FindBy(id="checkout")
	WebElement addToCartCheckoutBtn;
	
	
	public void clickOnCartIcon(){
		
		cartIcon.click();
	}
	
	public void clickOnCartCheckoutButton(){
		addToCartCheckoutBtn.click();
	}
}
