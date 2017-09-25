package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;

//import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class SeleniumTest {
//  private WebDriver driver;
//  private String baseUrl;
	  public WebDriver driver;
	  public String baseUrl;
	 
  @Before
  public void setUp() throws Exception {
  //  driver = new FirefoxDriver();
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ki\\Documents\\GitHub\\Udemy_Selenium\\seleniumpractice\\src\\seleniumpractice\\geckodriver.exe");
	driver = new FirefoxDriver();

    baseUrl = "http://www.letskodeit.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("DrpDwnMn01label")).click();
  }

  @After
  public void tearDown() throws Exception {
	  Thread.sleep(3000);
    //driver.quit();
    }
  }
