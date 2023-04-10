package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		WebElement alertbutton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alertbutton.click();
		driver.switchTo().alert().accept();
	
		WebElement confirmbutton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confirmbutton.click();
		driver.switchTo().alert().dismiss();
		
		WebElement promptbutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptbutton.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
		
		

	}

}
