package KeyboardMouseInteractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		//no concept of webelement as robot class is from java and mainly based on keyboard interactions,its a class
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Robot robot=new Robot();//class for keyboard interactions used in java
		robot.keyPress(KeyEvent.VK_DOWN);//to scroll down
		robot.mouseMove(2, 5);
		
			}

}
