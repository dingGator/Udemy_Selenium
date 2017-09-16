package tutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTagName {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\tutorialSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseURL = "http://demostore.x-cart.com/";
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		// if use tagName 
		//then it could easily create error
		//driver.findElement(By.tagName("a")).click();
		
		//id - fastest
		//name
		//className
		//xpath
		//linktext
		//partial linktext
		//tagname
		//css selector
	

	}

}
