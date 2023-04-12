package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.sendKeys("Bags");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("alert('Priya')");
		
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		js.executeScript("arguments[0].click();",searchbutton);
		js.executeScript("window.scrollBy(0,200)");
		
		
		
	}

}
