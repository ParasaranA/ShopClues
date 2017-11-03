package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyQuantityDecreaseAfterLogin extends BaseTest {
	@Test(priority=11)
	public void testQuantityDecreaseAfterLogin() throws InterruptedException
	{
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
		String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		HomePage h10=new HomePage(driver);
		h10.hoverSignIn(driver);
		h10.clickLoginRegister();
		Thread.sleep(20);
		h10.enteremail(un);
		Thread.sleep(20);
		h10.enterpassword(pw);
		Thread.sleep(20);
		h10.clickloginBTN();
		Thread.sleep(20);
		h10.clickSkip();
		Thread.sleep(20);
		h10.hoverHomeandKitchen(driver);
		h10.clickCurtains();
		CurtainsPage c6=new CurtainsPage(driver);
		c6.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c6.clickSearchBTN();
		c6.clickProdName();
		ProductDetailsPage p7=new ProductDetailsPage(driver);
		p7.clickaddtocart(driver);
		Thread.sleep(20);
		p7.clickCarticon(driver,10);
		MyCartPage m6=new MyCartPage(driver);
		m6.clickPlusBTN();
		m6.clickMinusBTN();
		m6.verifyDecreaseItems(driver,10);
	}

}
