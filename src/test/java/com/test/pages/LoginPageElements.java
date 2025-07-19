package com.test.pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods {
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	
	@FindBy(xpath="//button")
	public WebElement loginBtn;
	
	
	
	@FindBy(css = "div.toast-message")
	public WebElement invalidPassword;
	
	@FindBy(id = "txtPassword-error")
	public WebElement passwordEmptyError;
	
	public LoginPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void adminLogin()
	{
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(loginBtn);
	}

}