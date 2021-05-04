package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrime {
WebDriver driver;
	
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='dv-offers-container']/div[1]/div[1]/div[1]/div[2]/a[1]/span[2]")
	WebElement LoginButton; 
	
	public WebElement getLoginButton()
	{
		return LoginButton;
		
	}
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailInputField;
	
	public WebElement getemail()
	{
		return emailInputField;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordInputField;
	
	public WebElement getpassword()
	{
		return passwordInputField;
		
	}
	
	@FindBy(id="signInSubmit")
	WebElement signinButton;
	
	public WebElement getsignin()
	{
		return signinButton;
		
	}
//search the movie
	
	@FindBy(xpath="//input[@id='pv-search-nav']")
	WebElement searchBox;
	
	public WebElement getsearchBox()
	{
		return searchBox;
	}
	
	@FindBy(xpath="//body/div[@id='a-page']/section[@id='av-search']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement clickMovie;
	
	public WebElement getMovie()
	{
		return clickMovie;
	}
	
	
	
	public AmazonPrime(WebDriver driver) {
	       this.driver=driver;
			PageFactory.initElements(driver,this);
		}
}
	


