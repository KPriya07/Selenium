package assignmentselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		List<WebElement>checkbox=driver.findElements(By.xpath("//label[contains(@for,'check-box')]"));
					
		for(WebElement element:checkbox) {
			System.out.println(element.getText());
		
}

	}
}
