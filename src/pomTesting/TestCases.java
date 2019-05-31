package pomTesting;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class TestCases  extends TestListenerAdapter  {
     @Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Tc_01 test is passed successfully");
		//super.onTestSuccess(arg0);
	}
@Test
public void Tc_01() {
	Keyword k = new Keyword();
	k.openBrowser();
	k.openUrl("https://www.google.com/");
	k.implicitWait(20);
	k.sendElement("xpath", "//input[@title='Search']","miband");
	k.onClick("xpath", "//input[@value='Google Search']");
	System.out.println(k.Rdriver().getTitle());
}
}
