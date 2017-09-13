package tutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	
		driver = new FirefoxDriver();
		driver.get("http://seleniumhq.com");
		
		}

}
