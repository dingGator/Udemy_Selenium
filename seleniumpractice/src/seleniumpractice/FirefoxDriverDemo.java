package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ProtocolHandshake;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\seleniumpractice\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\seleniumpractice\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
		
	

	}

}
