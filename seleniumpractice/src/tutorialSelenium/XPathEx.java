package tutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\tutorialSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		
		//driver.manage().window().maximize();
		
		driver.get(baseURL);
	//driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		System.out.println("    driver.findElement(By.xpath('//*[@id='name']')).click();  ");
		driver.findElement(By.xpath("//*[@id='name']")).click();
		
		

	}

}
