package tutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FindByLinkText {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\tutorialSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseURL = "http://demostore.x-cart.com/";
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Contact")).click();
		
		
		

	}

}
