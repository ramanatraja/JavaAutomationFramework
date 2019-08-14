package com.mkyong.hashing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObject {
	public WebDriver driver;
	
	By title=By.cssSelector(".text-center h2");
	By pageAvailable=By.cssSelector("a[href='contact.php'");
	
	public LandingPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getTitles() {
		return driver.findElement(title);
		
	}
	
	public WebElement getValues() {
		return driver.findElement(pageAvailable);
	}
	

}
