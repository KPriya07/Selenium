package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	    firstname.sendKeys("Krishnapriya");
	    WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
	    lastname.sendKeys("Venugopal");
	    WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
	    username.sendKeys("Priya07");
	    WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
	    city.sendKeys("Ernakulam");
	    WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
	    state.sendKeys("Kerala");
	    WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
	    zip.sendKeys("683519");
	    WebElement checkbox=driver.findElement(By.xpath(" //input[@id='invalidCheck']"));
	    checkbox.click();
	    WebElement submitbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    submitbutton.click();
	    
	    WebElement successmsg=driver.findElement(By.xpath("//div[@id='message-one']"));
	    String s=successmsg.getText();
	    System.out.println(s);
	   
	 
	}

}
