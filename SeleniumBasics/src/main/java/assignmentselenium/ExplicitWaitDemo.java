package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php ");
		WebElement getnewuserbutton=driver.findElement(By.xpath("//button[@id='save']"));
		wait.until(ExpectedConditions.elementToBeClickable(getnewuserbutton));
		getnewuserbutton.click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
		WebElement name=driver.findElement(By.xpath("//h5[@class='card-title']"));
		String txtname=name.getText();
		System.out.println(txtname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='card-text text-center p-3']")));
		WebElement email=driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
		String txtemail=email.getText();
		System.out.println(txtemail);
		
	}

}
