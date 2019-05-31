package screenShotTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
/**
 * 
 * @author PANKAJ
 *  Ashot shoot method
 *  1.build prohect with Ashot jar 
 *  create instance of Ashot Ashot ashot = new ashot()
 *  Define shooting Stratagy
 *  ShootingStrategies.viewPortPasting(second)
 *  ashot.takescreenShot(driver);
 *  
 */
public class AshotTesting { 
	public static WebDriver driver ;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 Date date = new Date();
		 
		 AShot shot = new AShot();
		 //Screenshot a = shot.takeScreenshot(driver);
		  shot =  shot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		  Screenshot a = shot.takeScreenshot(driver);
		 // BufferedImage img = a.getImage();
		 try {
			ImageIO.write(a.getImage(), "PNG", new File("E:\\test\\SampleWS\\test\\Selenium-Testing\\screenshot\\"+date.toString().replace(" ", "_").replace(":", "")+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
