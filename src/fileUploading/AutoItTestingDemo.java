package fileUploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShotTest.LeftandRightClickUsingRobot;

public class AutoItTestingDemo {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Robot robo = new Robot();
		String path = "E:\\exam form\\photo n sign\\declaration.jpg";
        WebElement d=driver.findElement(By.xpath("//input[@id='imagesrc']"));
        LeftandRightClickUsingRobot.fileUpload(path, robo, d, driver);
        		
        //Runtime.getRuntime().exec("C://Users/PANKAJ/Desktop/Fileupload.exe");
	}

}
