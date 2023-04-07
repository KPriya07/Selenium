package ElementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		choosefile.sendKeys("D:\\\\Selenium\\\\FileUpload\\\\sample.docx");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();

//using file

		//File choose=new File("D:\\Selenium\\FileUpload\\sample.docx");
		//choosefile.sendKeys(choose.getAbsolutePath());
		
			}
}