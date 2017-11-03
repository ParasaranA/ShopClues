package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyQuantityIncreaseAfterLogin extends BaseTest {
	@Test(priority=10)
	public void testQuantityIncreaseAfterLogin() throws InterruptedException
	{
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
		String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		HomePage h9=new HomePage(driver);
		h9.hoverSignIn(driver);
		h9.clickLoginRegister();
		Thread.sleep(2000);
		h9.enteremail(un);
		Thread.sleep(2000);
		h9.enterpassword(pw);
		Thread.sleep(2000);
		h9.clickloginBTN();
		Thread.sleep(2000);
		h9.clickSkip();
		Thread.sleep(2000);
		h9.hoverHomeandKitchen(driver);
		h9.clickCurtains();
		CurtainsPage c5=new CurtainsPage(driver);
		c5.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c5.clickSearchBTN();
		c5.clickProdName();
		ProductDetailsPage p6=new ProductDetailsPage(driver);
		p6.clickaddtocart(driver);
		Thread.sleep(20);
		p6.clickCarticon(driver,10);
		MyCartPage m5=new MyCartPage(driver);
		m5.clickPlusBTN();
		m5.verifyIncreaseItems(driver,10);
	}

}
