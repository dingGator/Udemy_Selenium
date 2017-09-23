package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\tutorialSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
				
		driver.get(baseURL);
	
	}

}
