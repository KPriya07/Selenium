package KeyboardMouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MovetoelementSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();//methodoverloading
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		action.moveToElement(copy).click().build().perform();
		//action.doubleClick(doubleclick).build().perform();
	}

}
