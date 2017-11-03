package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;

public class VerifyQuantityIncrease extends BaseTest {
	
	@Test(priority=5)
	public void testVerifyQuantityIncrease() throws InterruptedException
	{
		HomePage h5=new HomePage(driver);
		h5.hoverHomeandKitchen(driver);
		h5.clickCurtains();
		CurtainsPage c2=new CurtainsPage(driver);
		c2.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c2.clickSearchBTN();
		c2.clickProdName();
		ProductDetailsPage p2=new ProductDetailsPage(driver);
		p2.clickaddtocart(driver);
		Thread.sleep(2000);
		p2.clickCarticon(driver,10);
		MyCartPage m1=new MyCartPage(driver);
		m1.clickPlusBTN();
		m1.verifyIncreaseItems(driver,10);
		
		
				
		
	}

	
	

}
