package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NormalAlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriverNew\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php ");
		WebElement buttonclick=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		buttonclick.click();
		WebElement alerttext=driver.findElement(By.xpath("//div[contains(text(),'autoclosable success')]"));
		alerttext.click();
		String s=alerttext.getText();
		System.out.println(s);
	}

}
