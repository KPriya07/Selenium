package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement singlecheckbox=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		
		boolean b=singlecheckbox.isSelected();
		System.out.println(b);
		WebElement twocheckbox=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		
		boolean b1=singlecheckbox.isSelected();
		System.out.println(b1);
		
		if(!singlecheckbox.isSelected()) {
			singlecheckbox.click();
		}
		if(!twocheckbox.isSelected()) {
			twocheckbox.click();
		}
		boolean s=singlecheckbox.isDisplayed();	
		System.out.println(s);
		boolean s1=twocheckbox.isDisplayed();	
		System.out.println(s1);
		boolean s3=singlecheckbox.isEnabled();
		System.out.println(s3);
		int x= singlecheckbox .getLocation().getX();
		System.out.println(x);
		int y= singlecheckbox .getLocation().getY();
		System.out.println(y);
	}
	
}



