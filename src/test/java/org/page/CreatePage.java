package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage extends BaseClass{
	public CreatePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create a Page']")
	private WebElement page;
	@FindBy(xpath="(//div[text()='Get Started'])[2]")
	private WebElement community;

	public WebElement getPage() {
		return page;
	}
	public WebElement getCommunity() {
		return community;
	}
}
