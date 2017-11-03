package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.HomePage;

public class SignOut extends BaseTest {
	
	@Test(priority=3)
	public void testSignOut(){
		String un3 = Lib.getCellvalue(XLPATH, "Login", 1, 1);
		String pw3=Lib.getCellvalue(XLPATH, "Login", 1, 2);
		HomePage h3=new HomePage(driver);
		h3.hoverSignIn(driver);
		h3.clickLoginRegister();
		h3.enteremail(un3);
		h3.enterpassword(pw3);
		h3.clickloginBTN();
		h3.clickSkip();
		h3.hoverAfterSignIn(driver);
		h3.clickSignout();
		h3.verifySignOut(driver, 10);
		
	}

}
