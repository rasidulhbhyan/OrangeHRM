package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

public static WebDriver driver;
	

public MasterPage(WebDriver driver) {
		this.driver=driver;
	}

public void click(String locator) {
	
	if(locator.contains("xpath")) {
	driver.findElement(By.xpath(locator.split(":")[1])).click();
	pause(250);
	}
	
	if(locator.contains("ID")) {
		driver.findElement(By.xpath(locator.split(":")[1])).click();
	pause(250);
	}
	
}


public void type(String locator, String text) {
	
	if(locator.contains("xpath")) {
	driver.findElement(By.xpath(locator.split(":")[1])).sendKeys(text);
									}
	if(locator.contains("ID")) {
		driver.findElement(By.xpath(locator.split(":")[1])).sendKeys(text);
								}
	
	}

public String getText(String locator) {
	
	if(locator.contains("xpath")) {
	return driver.findElement(By.xpath(locator.split(":")[1])).getText();
									}
	if(locator.contains("ID")) {
		return driver.findElement(By.xpath(locator.split(":")[1])).getText();
								}
	else return null;
	
	}	
		
public void hover (String locator) {
	
	
	if(locator.contains("xpath")) {
		Actions action = new Actions(driver);
		WebElement element= driver.findElement(By.xpath(locator.split(":")[1]));
		action.moveToElement(element).build().perform();
		pause(250);
										}
	if(locator.contains("id")) {
		Actions action = new Actions(driver);
		WebElement element= driver.findElement(By.id(locator.split(":")[1]));
		action.moveToElement(element).build().perform();
		pause(250);								}

									}

public void pause(int mls) {
	
	try {
		Thread.sleep(mls);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}

}









}














	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
