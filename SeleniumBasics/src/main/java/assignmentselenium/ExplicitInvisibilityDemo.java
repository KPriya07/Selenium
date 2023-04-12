package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitInvisibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		WebElement downloadbutton=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
		downloadbutton.click();
				
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel Download')]")));
		
		
		WebElement complete=driver.findElement(By.xpath("//div[@id='dialog']//div[@class='progress-label']"));
		String textcom=complete.getText();
		System.out.println(textcom);
	}

}
