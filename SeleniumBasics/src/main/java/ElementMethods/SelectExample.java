package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement allsearch=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select alldropdown=new Select(allsearch);//Select is a class ,eg of para.constru
		alldropdown.selectByIndex(1);//position
		alldropdown.selectByValue("search-alias=fashion");//choosing the attribute value from dropdown
		alldropdown.selectByVisibleText("Amazon Devices");
		
		
	}
}