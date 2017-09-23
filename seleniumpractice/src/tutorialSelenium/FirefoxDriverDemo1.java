package tutorialSelenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo1 {

	public static void main(String[] args) {
	//	String baseURL = "http://www.google.com";
		
		WebDriver driver;
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\tutorialSelenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "https://www.google.com";
		driver.get(baseURL);
	}

}
