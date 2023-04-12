package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singlebox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement box1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement box3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement box4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",singlebox);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",box1);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();",box2);
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();",box3);
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();",box4);
		WebElement copyright=driver.findElement(By.xpath("//p[contains(text(),'Testing')]"));
		JavascriptExecutor js5=(JavascriptExecutor) driver;
		js5.executeScript("arguments[0].scrollIntoView();", copyright);

	
	}
	}
