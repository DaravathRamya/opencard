package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/* data is valid - login success - -test pass - logout
 * Data is valid--login failed- test fail
 * 
 * Data is invalid- login success - test fail - logout
 * data is invalid--login filed - test pass
 */

public class TC_003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass = DataProviders.class,groups="Datadriven")//getting data provider from different class
	public void verify_loginDDt(String email,String pswd,String exp) throws InterruptedException {
		
		logger.info("****starting TC_003_LoginDDt****");
		try {
		//HomePage	
	      HomePage hp=new HomePage(driver);
		  hp.clickmyaccount();
		  hp.clicklogin();
		  
		//Login
		  LoginPage lp=new LoginPage(driver);
		  lp.email(email);
		  lp.password(pswd);
		  lp.login();
		  
		//MyAccount
		   MyAccountPage MyAC=new MyAccountPage(driver);
		   boolean targetpage = MyAC.IsMyAccountExist();
		
		 if(exp.equalsIgnoreCase("Valid")) {
			 if(targetpage==true)
			 {
				 MyAC.clicklogout();
				 Assert.assertTrue(true);
				 
			 }
			 else {
				Assert.assertTrue(false); 
			 }
			 
		 }
		 /*else {
			 Assert.assertTrue(false);
		 }*/
		 
		 if(exp.equalsIgnoreCase("Invalid")) {
			if(targetpage==true)
			{
				MyAC.clicklogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		 }
		}
		catch(Exception e) {
			Assert.fail();
		}
		 logger.info("****Finished TC_003_LoginDDt****");
		   
	}  
		   
}	   
		   
		   
		   
		
	
	
	
	
	
	
	
	
	


