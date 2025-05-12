package testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	@Test(groups={"Sanity","master"})
	public void verify_login() throws InterruptedException {
		
		logger.info("****Starting loginTest****");
		try {
	//HomePage	
      HomePage hp=new HomePage(driver);
	  hp.clickmyaccount();
	  hp.clicklogin();
	  
	//Login
	  LoginPage lp=new LoginPage(driver);
	  lp.email(p.getProperty("EMAIL"));
	  lp.password(p.getProperty("PWD"));
	  lp.login();
	  
	 //MyAccount
	   MyAccountPage MyAC=new MyAccountPage(driver);
	   boolean targetpage = MyAC.IsMyAccountExist();
	   Assert.assertEquals(targetpage, true, "Login failed");//Assert.assertTrue(targetpage);
	 
		}
		catch(Exception e){
			Assert.fail();
		}
	  logger.info("****finshing loginTest****");
		
	 
	 
	 
	}
  
}
