package ElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startbutton=driver.findElement(By.xpath("//button[text()]"));
		wait.until(ExpectedConditions.elementToBeClickable(startbutton));//wait until its clickable
		startbutton.click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		WebElement startclickmsg=driver.findElement(By.xpath("//div[@id='finish']"));
		String name=startclickmsg.getText();
		System.out.println(name);
	}

}
