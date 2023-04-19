package KeyboardMouseInteractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions actions=new Actions(driver);
		
		WebElement cookies=driver.findElement(By.xpath("//button[@id='save']"));
		wait.until(ExpectedConditions.elementToBeClickable(cookies));
		cookies.click();
		WebElement source=driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='amt7'][1]"));
		actions.dragAndDrop(source, destination).build().perform();//methodoverloading
		
		
	}
	
}
