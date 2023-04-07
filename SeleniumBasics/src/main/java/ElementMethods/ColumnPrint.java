package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ColumnPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tablerow=driver.findElement(By.xpath("//table//tbody//tr[3]//td[1]"));
		System.out.println("Name is "+tablerow.getText());
		WebElement tablecolumn=driver.findElement(By.xpath("//table//tbody//tr[3]//td[3]"));
		System.out.println("Office is "+tablecolumn.getText());
	}

}

