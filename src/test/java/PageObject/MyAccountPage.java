package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends basepage{
    public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement msgHeading;
    By logout=By.xpath("//div[@class='list-group']//a[text()='Logout']");//added in step no6
    		
    public boolean IsMyAccountExist() {
    	
    	try {
    	return(msgHeading.isDisplayed());
    	}
    	catch(Exception e) {
    		return false;
    	}
    }
    public void clicklogout() {
    	driver.findElement(logout).click();
    }
    
    
}
