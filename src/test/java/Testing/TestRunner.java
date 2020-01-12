package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProfilePage;

public class TestRunner extends TestBase {



@Test
public void goToHRMTest() {
	
	
	startBrowser("chrome");
	HomePage home = new HomePage(driver);
	
	home.goToHRM();
	home.logIn("Admin", "admin123");
	
	ProfilePage profile =new ProfilePage(driver);
	String displayedName= profile.getNameDisplayed();
	
	Assert.assertEquals(displayedName, "Welcome Admin", "Test Failed");
	
	
}

public void goToUserPage() {
	
	startBrowser("chrome");
	HomePage home = new HomePage(driver);
	
	home.goToHRM();
	home.logIn("Admin", "admin123");
	
	ProfilePage profile =new ProfilePage(driver);
	profile.goToUserPage();
	
}


public void goJobTitlePage() {
	
	startBrowser("chrome");
	HomePage home = new HomePage(driver);
	
	home.goToHRM();
	home.logIn("Admin", "admin123");
	
	ProfilePage profile =new ProfilePage(driver);
	profile.goToJobTitlePage();
	
	
	
	
}
























































}