package basicsyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.co.uk/");
		driver.navigate().to("https://www.tesco.com/");
		driver.navigate().to("https://www.ebay.co.uk/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
