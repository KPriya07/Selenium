package ElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startbutton=driver.findElement(By.xpath("//button[text()]"));
		startbutton.click();
		//Thread.sleep(7000);//used in java.this will freezes the code.wont resume the execution unless the timer elapsed
		
			
		WebElement startclickmsg=driver.findElement(By.xpath("//div[@id='finish']"));
		String name=startclickmsg.getText();
		System.out.println(name);
	}

}
