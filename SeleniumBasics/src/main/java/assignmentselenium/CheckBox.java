package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singlecheckbox.click();
		WebElement checkboxone=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkboxone.click();
		WebElement checkboxtwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkboxtwo.click();
		WebElement checkboxthree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		checkboxthree.click();
		WebElement checkboxfour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		checkboxfour.click();
	}
	
}