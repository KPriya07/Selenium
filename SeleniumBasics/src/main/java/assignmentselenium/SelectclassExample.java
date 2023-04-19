package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-dual-list.php");
		WebElement options=driver.findElement(By.xpath("//select[@size='15']"));
		Select options1=new Select(options);
		//options1.selectByValue("Swift");
		options1.selectByVisibleText("Swift");
		WebElement addbutton=driver.findElement(By.xpath("//button[text()='Add']"));
		addbutton.click();
		
	}

}
