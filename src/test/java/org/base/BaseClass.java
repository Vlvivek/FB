package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebElement element;
	public static WebDriver driver;
	
	public static void setupInitiative(String browser, String url) {
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else {
			System.out.println("Invalid Browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void passValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickIt(WebElement element) {
		element.click(); 
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void screenshot(File file) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, file);
	}
	public static void dropSelectingByText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border: 3px solid red');",element);
	}
	
	
	
	
	
}
