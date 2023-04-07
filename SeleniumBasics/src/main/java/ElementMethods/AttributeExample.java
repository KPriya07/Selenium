package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AttributeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//by id
		String s=searchfield.getAttribute("id");
		System.out.println(s);
		String s1=searchfield.getAttribute("class");
		System.out.println(s1);
		WebElement tooltip=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String s3=tooltip.getAttribute("title");
		System.out.println(s3);
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		String backcolor=searchbutton.getCssValue("background-color");
		System.out.println(backcolor);
		String color=searchbutton.getCssValue("color");
		System.out.println(color);
		String allcolor=tooltip.getCssValue("background-color");
		System.out.println(allcolor);
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement searchbutton1=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		String backcolor1=searchbutton1.getCssValue("background-color");
		System.out.println(backcolor1);
		String fontsize=searchbutton1.getCssValue("font-size");
		System.out.println(fontsize);
		String fontstyle=searchbutton1.getCssValue("font-style");
		System.out.println(fontstyle);
		}
	
}