package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountregisterpage extends basepage{
	public Accountregisterpage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	By FN=By.xpath("//input[@id='input-firstname']");
	By LN=By.xpath("//input[@id='input-lastname']");
	By Email=By.xpath("//input[@id='input-email']");
	By tele=By.xpath("//input[@type='tel']");
	By pwd=By.xpath("//input[@id='input-password']");
	By confirm=By.xpath("//input[@name='confirm']");
	By continu=By.xpath("//input[@type='submit']");
	By pp=By.xpath("//input[@name='agree']");
	
	
	
	//action methods
	public void fistname(String fname) {
		driver.findElement(FN).sendKeys(fname);
	}
	public void lastname(String lname) {
		driver.findElement(LN).sendKeys(lname);
	}
	public void email(String mail) {
		driver.findElement(Email).sendKeys(mail);
	}
	public void setTelephone(String tel) {
		driver.findElement(tele).sendKeys(tel);
	}
	public void password(String psw) {
		driver.findElement(pwd).sendKeys(psw);
	}
	public void conf(String confirmpwd) {
		driver.findElement(confirm).sendKeys(confirmpwd);
	}
	public void privacypolacy() {
		driver.findElement(pp).click();
	}
	
	public void continuebutton() {
		driver.findElement(continu).click();
	}
	
	
	public String getConfirmationmsg() {
		WebElement msgConfirmation = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	
}
	
