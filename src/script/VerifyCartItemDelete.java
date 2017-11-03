package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.MyCartPage;
import pom.ProductDetailsPage;
import generic.BaseTest;

public class VerifyCartItemDelete extends BaseTest {
	
	@Test(priority=7)
	public void testCartItemDelete() throws InterruptedException
	{
		HomePage h7=new HomePage(driver);
		h7.hoverHomeandKitchen(driver);
		h7.clickCurtains();
		CurtainsPage c4=new CurtainsPage(driver);
		c4.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c4.clickSearchBTN();
		c4.clickProdName();
		ProductDetailsPage p4=new ProductDetailsPage(driver);
		p4.clickaddtocart(driver);
		Thread.sleep(20);
		p4.clickCarticon(driver,10);
		MyCartPage m3=new MyCartPage(driver);
		m3.clickRemoveLink();
		m3.clickRemove();
		m3.verifyItemDeleted(driver,10);
	}

}
