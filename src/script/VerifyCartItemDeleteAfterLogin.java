package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyCartItemDeleteAfterLogin extends BaseTest {
	@Test(priority=12)
	public void testCartItemDeleteAfterLogin() throws InterruptedException
	{
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
		String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		HomePage h11=new HomePage(driver);
		h11.hoverSignIn(driver);
		h11.clickLoginRegister();
		h11.enteremail(un);
		h11.enterpassword(pw);
		h11.clickloginBTN();
		h11.clickSkip();
		h11.hoverHomeandKitchen(driver);
		h11.clickCurtains();
		CurtainsPage c7=new CurtainsPage(driver);
		c7.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c7.clickSearchBTN();
		c7.clickProdName();
		ProductDetailsPage p8=new ProductDetailsPage(driver);
		p8.clickaddtocart(driver);
		Thread.sleep(20);
		p8.clickCarticon(driver,10);
		MyCartPage m7=new MyCartPage(driver);
		m7.clickRemoveLink();
		m7.clickRemove();
		m7.verifyItemDeleted(driver,10);
	}

}
