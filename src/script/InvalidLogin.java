package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.HomePage;

public class InvalidLogin extends BaseTest {
	
	@Test(priority=2)
	public void testInvalidLogin()
	{
		String un2=Lib.getCellvalue(XLPATH, "Login", 2, 1);
		String pw2=Lib.getCellvalue(XLPATH, "Login", 2, 2);
		HomePage h2=new HomePage(driver);
		h2.hoverSignIn(driver);
		h2.clickLoginRegister();
		h2.enteremail(un2);
		h2.enterpassword(pw2);
		h2.clickloginBTN();
		h2.verifyErrorMsg(driver, 10);
	}
	

}
