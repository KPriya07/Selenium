package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button1.click();
		driver.switchTo().alert().accept();
		
		WebElement button2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button2.click();
		String AlertText=driver.switchTo().alert().getText();//to return alert text
		System.out.println(AlertText);
		driver.switchTo().alert().dismiss();//To cancel
		WebElement button3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		button3.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
		
		

	}

}
