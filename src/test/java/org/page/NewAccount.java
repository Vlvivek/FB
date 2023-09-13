package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount extends BaseClass{
	
	public NewAccount() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newAccButton;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surName;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement reemail;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement pass;
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement date;
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement signup;
	
	
	public WebElement getNewAccButton() {
		return newAccButton;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getSurName() {
		return surName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getReEmail() {
		return reemail;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getyear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSignup() {
		return signup;
	}
	
	
}
