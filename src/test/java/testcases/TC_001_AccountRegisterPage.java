
package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.Accountregisterpage;
import PageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegisterPage extends BaseClass{
	
	
	
	@Test(groups={"Regression","master"})
	public void verifyAccountRegister() throws InterruptedException {
		
		logger.info("Staring TC_001_AccountRegisterPage" );
		try {
				
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		logger.info("clicked on MyAccount link" );
		hp.clickmyaccount();
		logger.info("clicked on MyRegister link" );
		hp.clickregister();
		
		
		Accountregisterpage Regpage=new Accountregisterpage(driver);
		logger.info("Providing the customer details" );
		 Regpage.fistname(randomeString().toUpperCase());
	     Regpage.lastname(randomeString().toUpperCase());
	     Regpage.email(randomeString()+"@gmail.com");//randomly generated the mail
	     Regpage.setTelephone(randomNumber());
	     String pswd=randomalphaNumaric();
	     Regpage.password(pswd);
	     Regpage.conf(pswd);
	     Regpage.privacypolacy();
	     Regpage.continuebutton();
	     
	     logger.info("validating the Expected Message" );
	     String confmsg=Regpage.getConfirmationmsg();
	     if(confmsg.equals("Your Account Has Been Created!")) {
	    	 Assert.assertTrue(true);
	     }
	     else {
	    	 logger.error("test failed");
			 logger.debug("debug logs....");
			 Assert.assertTrue(false);
	     }
	     
	     //Assert.assertEquals(confmsg, "Your Account Has Been Created!!");
	}
	
	 catch(Exception e) {
		 
		 Assert.fail();
		 
		 
		 
	   } 
	}
}
	
	
	
	
	
	
	

