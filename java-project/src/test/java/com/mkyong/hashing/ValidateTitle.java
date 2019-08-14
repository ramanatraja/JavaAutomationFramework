package com.mkyong.hashing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.InvokeWebDriver;

public class ValidateTitle extends InvokeWebDriver {
	public static final Logger logger = LogManager.getLogger(ValidateTitle.class.getName());
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = intializeWebDriver();
		logger.info("initializing driver");
		
	}
	
	@Test
	public void validateTitle()  {
		
		String url=p.getProperty("url");
		driver.get(url);
		LandingPageObject l=new LandingPageObject(driver);
		Assert.assertEquals(l.getTitles().getText(), "FEATURED COURSES");
		logger.info("validating text checks");
		Assert.assertTrue(l.getValues().isDisplayed());
		logger.info("Object is available or not");
	}
	@AfterClass
	public void afterTest() {
		driver.close();
		driver=null;
	}

}
