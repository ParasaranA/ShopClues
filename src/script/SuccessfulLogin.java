package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.HomePage;

public class SuccessfulLogin extends BaseTest {
	@Test(priority=1)
	public void testSuccessfulLogin()
	{
		String un1 = Lib.getCellvalue(XLPATH, "Login", 1, 1);
		String pw1=Lib.getCellvalue(XLPATH, "Login", 1, 2);
		HomePage h=new HomePage(driver);
		h.hoverSignIn(driver);
		h.clickLoginRegister();
		h.enteremail(un1);
		h.enterpassword(pw1);
		h.clickloginBTN();
		h.clickSkip();
		h.verifySignIn(driver, 10);
	}

}
