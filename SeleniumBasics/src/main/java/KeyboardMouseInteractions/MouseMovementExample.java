package KeyboardMouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement mail=driver.findElement(By.xpath("//div[@class='wf-td right-block']//a[@title='Mail']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mail).build().perform();//to move the mouse to webelement ,movetoelementoffset means to move mouse to which cordinate
		actions.moveToElement(mail, 2, 5).build().perform();//methodoverloading
		driver.get("https://www.amazon.in/");
		WebElement alldropdown=driver.findElement(By.xpath("//select[@title='Search in']"));
		actions.moveToElement(alldropdown).build().perform();
		
		
	}

}
