package com.mkyong.hashing;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.InvokeWebDriver;

public class HomePage extends InvokeWebDriver{
@BeforeClass
public void beforeClass() throws IOException {
	driver = intializeWebDriver();
	
}
@Test
public void invokeBrowser() {
	driver.get(p.getProperty("url"));
	
	LoginPageObject l=new LoginPageObject(driver);
	l.getPopup().click();
	l.getLogin().click();
	l.getUserName().sendKeys("hi@gmail.com");
	l.getPassword().sendKeys("how");
	l.getLoginDetails().click();
	
}
@AfterClass
public void afterTest() {
	driver.close();
	driver=null;
}

}
