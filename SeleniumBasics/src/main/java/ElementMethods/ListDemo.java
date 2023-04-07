package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//ul[@class='navbar-nav']//li/a"));
		List<WebElement>Headers=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
		System.out.println(Headers.size());
		for(int i=0;i<7;i++) {
			String text=Headers.get(i).getText();
			System.out.println(text);
}

		for(WebElement element:Headers) {
		System.out.println(element.getText());
	
}

	

	}
}
