package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {

String userNameBox= "xpath://input[@id='txtUsername']";
String passwordBox= "xpath://input[@id='txtPassword']";
String logInButton= "xpath://input[@id='btnLogin']";

public HomePage (WebDriver driver) {
	
	super(driver);
}

public void goToHRM() {

	driver.get("https://opensource-demo.orangehrmlive.com");
}

public void logIn(String userName, String password) {
	
	type(userNameBox, userName);
	type(passwordBox, password);
	click(logInButton);
	
	
}

















}