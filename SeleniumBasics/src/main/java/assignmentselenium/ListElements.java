package assignmentselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//div[@class='form-group']//div//input[@class='check-box-list']"));
			for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
			
	}

	}
}
