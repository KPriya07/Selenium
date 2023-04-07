package assignmentselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement submitbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    submitbutton.click();
	    
	    List<WebElement>negative=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
	    
	    for(WebElement e:negative) {
	    	
	    	System.out.println(e.getText());
	    	
	    }
	   
	}

}
