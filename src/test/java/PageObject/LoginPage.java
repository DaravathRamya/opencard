package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends basepage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//WebElements
	By email_box=By.xpath("//input[@id='input-email']");
	By pwd_box=By.xpath("//input[@id='input-password']");
	By login_button=By.xpath("//input[@value='Login']");
	
	//Action methods
	public void email(String Email) {
		driver.findElement(email_box).sendKeys(Email);
	}
	public void password(String pswd) {
		driver.findElement(pwd_box).sendKeys(pswd);
	}
	public void login() {
		driver.findElement(login_button).click();
	}

}
