package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.PaymentPage;
import pom.ProductDetailsPage;
import pom.ReviewPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyInvalidCardNameErrorMsg extends BaseTest {
	@Test(priority=14)
	public void testInvalidCardNameErrorMsg() throws InterruptedException
	{  
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
	    String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		String creditcardno=Lib.getCellvalue(XLPATH,"CreditCardDetails", 2, 0);
		String month=Lib.getCellvalue(XLPATH,"CreditCardDetails", 2, 1);
		String year=Lib.getCellvalue(XLPATH,"CreditCardDetails", 2, 2);
		String cvv=Lib.getCellvalue(XLPATH,"CreditCardDetails", 2, 3);
		String name=Lib.getCellvalue(XLPATH,"CreditCardDetails", 2, 4);
		HomePage h13=new HomePage(driver);
		h13.hoverSignIn(driver);
		h13.clickLoginRegister();
		Thread.sleep(2000);
		h13.enteremail(un);
		Thread.sleep(2000);
		h13.enterpassword(pw);
		Thread.sleep(2000);
		h13.clickloginBTN();
		Thread.sleep(2000);
		h13.clickSkip();
		Thread.sleep(2000);
		h13.hoverHomeandKitchen(driver);
		h13.clickCurtains();
		CurtainsPage c9=new CurtainsPage(driver);
		c9.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c9.clickSearchBTN();
		c9.clickProdName();
		ProductDetailsPage p10=new ProductDetailsPage(driver);
		p10.clickBuyNow(driver);
		ReviewPage r2=new ReviewPage(driver);
		r2.clickProceedtoPayments();
		PaymentPage p2=new PaymentPage(driver);
		p2.switchToframe(driver);
		p2.entercardno(creditcardno);
		Thread.sleep(2000);
		p2.enterMM(month);
		Thread.sleep(2000);
		p2.enterYY(year);
		Thread.sleep(2000);
		p2.enterCVV(cvv);
		Thread.sleep(2000);
		p2.entercardname(name);
		Thread.sleep(2000);
		p2.clickPayBTN();
		p2.verifyInvalidCardName();
		
	}
	

}
