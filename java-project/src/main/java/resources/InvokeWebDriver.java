package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeWebDriver {
	public WebDriver driver;
	public Properties p;
	
	
	public WebDriver intializeWebDriver() throws IOException {
		 p = new Properties();
		FileInputStream fis=new FileInputStream("C:\\java-project\\src\\main\\java\\com\\mkyong\\hashing\\test.properties");
		p.load(fis);
		String browser=p.getProperty("browser");
		System.out.println(browser);
		if (browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//x243469//Downloads//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return driver;
	}
	

}
