package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPage extends BaseClass{
	public ForgotPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forgotten password?']")
	public WebElement forgotButton;
	
	public WebElement getForgotButton() {
		return forgotButton;
	}
}
