package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
public static WebDriver driver;
	
	
public void startBrowser(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/Razzy/eclipse-workspace/OrangeHRM/chromedriver");}
	
	
	
	
	
	
}	
	
	
	
}
