package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basepage{
	
  public HomePage(WebDriver driver) 
  {
	 super(driver);
  }
   By myac_button=By.xpath("//span[normalize-space()='My Account']");
   By regi_button=By.xpath("//a[normalize-space()='Register']");
   @FindBy(linkText = "Login")
   WebElement login_button;
   
   public void clickmyaccount() {
	   driver.findElement(myac_button).click();
   }
   public void clickregister() {
	   driver.findElement(regi_button).click();
   }
   public void clicklogin() {
	   login_button.click();
   }
}
