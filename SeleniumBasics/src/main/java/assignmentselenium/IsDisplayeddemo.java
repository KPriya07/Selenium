package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayeddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(" https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		WebElement male=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
		String r=male.getText();
		System.out.println(r);
		WebElement female=driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
		String r1=female.getText();
		System.out.println(r1);
		if(!radio1.isSelected()) {
			radio1.click();
		}
		if(!radio2.isSelected()) {
			radio2.click();
		}
		boolean b1=radio1.isSelected();
		System.out.println(b1);		
		boolean s=radio1.isDisplayed();	
		System.out.println(s);
		boolean s1=radio2.isDisplayed();	
		System.out.println(s1);
		boolean s2=radio1.isEnabled();
		System.out.println(s2);
		boolean s3=radio1.isEnabled();
		System.out.println(s3);
		WebElement showmsg=driver.findElement(By.xpath("//button[contains(@id, 'button-one')]"));
		showmsg.click();
		WebElement selected=driver.findElement(By.xpath("//div[@id='message-one']"));
		String r5=selected.getText();
		System.out.println(r5);
	}
	
}



