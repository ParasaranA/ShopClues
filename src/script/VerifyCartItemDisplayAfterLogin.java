package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyCartItemDisplayAfterLogin extends BaseTest {
	
	@Test(priority=8)
	public void testCartItemDisplayAfterLogin1() throws InterruptedException
	{
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
		String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		HomePage h8=new HomePage(driver);
		h8.hoverSignIn(driver);
		h8.clickLoginRegister();
		h8.enteremail(un);
		h8.enterpassword(pw);
		h8.clickloginBTN();
		h8.clickSkip();
		h8.hoverHomeandKitchen(driver);
		h8.clickCurtains();
		CurtainsPage c5=new CurtainsPage(driver);
		c5.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c5.clickSearchBTN();
		c5.clickProdName();
		ProductDetailsPage p5=new ProductDetailsPage(driver);
		p5.clickaddtocart(driver);
		Thread.sleep(2000);
		p5.hoverCarticon(driver);
		p5.verifyCartitemDisplay(driver,10);
		
	}
	
	@Test(priority=9)
	public void testCartItemDisplayAfterLogin2() throws InterruptedException
	{
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
		String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		HomePage h8=new HomePage(driver);
		h8.hoverSignIn(driver);
		h8.clickLoginRegister();
		h8.enteremail(un);
		h8.enterpassword(pw);
		h8.clickloginBTN();
		h8.clickSkip();
		h8.hoverHomeandKitchen(driver);
		h8.clickCurtains();
		CurtainsPage c5=new CurtainsPage(driver);
		c5.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c5.clickSearchBTN();
		c5.clickProdName();
		ProductDetailsPage p5=new ProductDetailsPage(driver);
		p5.clickaddtocart(driver);
		Thread.sleep(2000);
		p5.clickCarticon(driver,10);
		MyCartPage m4=new MyCartPage(driver);
		m4.verifyCartItemDisplay(driver,10);
	}
	
	

}
