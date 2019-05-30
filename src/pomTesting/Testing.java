

package pomTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testing {
	@Test
	public void start() {
	WebDriver driver = new ChromeDriver();
    BaseClass2 cls = new BaseClass2(driver);
          driver.get("https://www.amazon.in/");
          cls.searchAnything("mi band");
          cls.clickOnSearch();
	      cls.close();
	}
}
