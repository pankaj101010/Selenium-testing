package pomTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public WebDriver driver;

	By search = By.id("twotabsearchtextbox");
	By click = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");

	BaseClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchAnything(String text){
		driver.findElement(search).sendKeys(text);
	}
	 public void clickOnSearch()  {
		 driver.findElement(click).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
    public void close() {
    	driver.close();
    }
}
