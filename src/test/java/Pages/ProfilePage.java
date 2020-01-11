package Pages;

import org.openqa.selenium.WebDriver;

public class ProfilePage extends MasterPage {

	
	String nameDisplayed= "xpath://a[@id='welcome']";
	String adminHover= "xpath://b[contains(text(),'Admin')]";
	String jobHover= "xpath://a[@id='menu_admin_Job']";
	
	String jobTitleButton="xpath://a[@id='menu_admin_viewJobTitleList']";
	
	String userManageHover="xpath://a[@id='menu_admin_UserManagement']";	 
	String userButton= "xpath://a[@id='menu_admin_viewSystemUsers']";
	
	
public ProfilePage(WebDriver driver) {
		super(driver);
		
	}


public String getNameDisplayed() {
	
	return getText(nameDisplayed);
	
}

public void goToUserPage() {
	
	hover(adminHover);
	click(userManageHover);
	click(userButton);
	
	
}

public void goToJobTitlePage() {
	
	hover(adminHover);
	click(jobHover);
	click(jobTitleButton);
	
}
}
