package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	private WebElement button;
	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getButton() {
		return button;
	}
	
}
