package KeyboardMouseInteractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions actions=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='column-b']"));
		actions.dragAndDrop(source, destination).build().perform();
	}

}
