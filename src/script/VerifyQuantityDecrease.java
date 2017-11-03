package script;

import generic.BaseTest;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;

public class VerifyQuantityDecrease extends BaseTest {
	@Test(priority=6)
	public void testVerifyQuantityDecrease() throws InterruptedException
	{
		HomePage h6=new HomePage(driver);
		h6.hoverHomeandKitchen(driver);
		h6.clickCurtains();
		CurtainsPage c3=new CurtainsPage(driver);
		c3.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c3.clickSearchBTN();
		c3.clickProdName();
		ProductDetailsPage p3=new ProductDetailsPage(driver);
		p3.clickaddtocart(driver);
		Thread.sleep(20);
		p3.clickCarticon(driver,10);
		MyCartPage m2=new MyCartPage(driver);
		m2.clickPlusBTN();
		m2.clickMinusBTN();
		m2.verifyDecreaseItems(driver,10);
		
		
		
	}

}
