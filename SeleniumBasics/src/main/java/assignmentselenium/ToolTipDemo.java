package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		
		WebElement likeusonfacebook=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String s=likeusonfacebook.getAttribute("title");
		System.out.println(s);
		
		WebElement followall=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		String s1=followall.getAttribute("title");
		System.out.println(s1);
		}
	
}