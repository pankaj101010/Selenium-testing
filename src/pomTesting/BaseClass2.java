package pomTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BaseClass2 {

	WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;
	// or
	// @FindBy(how=How.ID,using="twotabsearchtextbox") WebElement search1;
	@FindBy(how = How.XPATH, using = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement click;

	BaseClass2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchAnything(String text) {
		search.sendKeys(text);
	}

	public void clickOnSearch() {
		click.click();
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
