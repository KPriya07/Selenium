package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cssexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));//by id
		//searchfield.sendKeys("bags");
		WebElement searchfield=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));//by class
	    searchfield.sendKeys("bags");
		
		
		}
	
}