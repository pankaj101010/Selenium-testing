package screenShotTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class ScreenShotElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 Screenshot a = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver, driver.findElement(By.xpath("//input[@name='q']")));
				 try {
					ImageIO.write(a.getImage(), "PNG", new File("E:\\div_element.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
