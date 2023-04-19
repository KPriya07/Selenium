package KeyboardMouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions=new Actions(driver);
		actions.sendKeys(searchfield,"Handbags").build().perform();
		actions.clickAndHold(searchfield).build().perform();
		//actions.release(searchfield).build().perform();
		actions.keyDown(searchfield, Keys.BACK_SPACE).build().perform();//to press 
		//actions.keyUp(searchfield, Keys.BACK_SPACE).build().perform();//to release
		
	}

}
