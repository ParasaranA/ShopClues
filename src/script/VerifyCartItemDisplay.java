package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.ProductDetailsPage;
import generic.BaseTest;

public class VerifyCartItemDisplay extends BaseTest {
	@Test(priority=4)
	public void testverifyCartItemDisplay() throws InterruptedException
	{
		HomePage h4=new HomePage(driver);
		h4.hoverHomeandKitchen(driver);
		h4.clickCurtains();
		CurtainsPage c1=new CurtainsPage(driver);
		c1.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c1.clickSearchBTN();
		c1.clickProdName();
		ProductDetailsPage p1=new ProductDetailsPage(driver);
		p1.clickaddtocart(driver);
		Thread.sleep(2000);
		p1.hoverCarticon(driver);
		p1.verifyCartitemDisplay(driver,10);
	}

}
