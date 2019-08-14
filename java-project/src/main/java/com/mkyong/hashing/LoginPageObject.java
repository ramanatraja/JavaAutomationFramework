package com.mkyong.hashing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By username=By.id("user_email");
	By password=By.id("user_password");
	By Login=By.name("commit");
	By popupclose=By.cssSelector("div button");
	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getPopup() {
		return driver.findElement(popupclose);
	}
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	public WebElement getUserName() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginDetails() {
		return driver.findElement(Login);
	}
}
