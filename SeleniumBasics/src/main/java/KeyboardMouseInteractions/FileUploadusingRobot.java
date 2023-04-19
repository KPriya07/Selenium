package KeyboardMouseInteractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadusingRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Actions action=new Actions(driver);
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path="D:\\Selenium\\FileUpload\\sample.docx";
		Robot robot=new Robot();
		action.moveToElement(choosefile).click().build().perform();
		StringSelection ss = new StringSelection(path);//to add it to the clipboard
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//will save to the clipboard
		//choosefile.click();
		robot.delay(1000);//delay is method in robot class to pause
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);//ctrl v for pasting
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
