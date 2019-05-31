package pomTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestListenerAdapter;

public  class Keyword{
	public  WebDriver driver;	

	private WebElement getValue(String locator, String value) {
		WebElement link = null;
		switch (locator) {
		case "xpath":
			link = driver.findElement(By.xpath(value));
			break;
		case "id":
			link = driver.findElement(By.id(value));
			break;
		}
		return link;

	}

	public  void openBrowser() {
		driver = new ChromeDriver();

	}
    
	public WebDriver Rdriver() {
		return driver;
		
	} 
	public  void openUrl(String url) {
		driver.get(url);
	}
	public void implicitWait(int second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}
	
     
	public void sendElement(String locator , String value,String sendkeys) {
		getValue(locator, value).sendKeys(sendkeys);
	}
	public void onClick(String locator , String value)
	{
		getValue(locator, value).click();
	}
	
	
}
