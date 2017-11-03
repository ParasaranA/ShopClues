package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.PaymentPage;
import pom.ProductDetailsPage;
import pom.ReviewPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyInvalidCCNumberErrorMsg extends BaseTest {
	@Test(priority=13)
	public void testInvalidCCErrorMsg() throws InterruptedException
	{  
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
	    String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		String creditcardno=Lib.getCellvalue(XLPATH,"CreditCardDetails", 1, 0);
		String month=Lib.getCellvalue(XLPATH,"CreditCardDetails", 1, 1);
		String year=Lib.getCellvalue(XLPATH,"CreditCardDetails", 1, 2);
		String cvv=Lib.getCellvalue(XLPATH,"CreditCardDetails", 1, 3);
		String name=Lib.getCellvalue(XLPATH,"CreditCardDetails", 1, 4);
		HomePage h12=new HomePage(driver);
		h12.hoverSignIn(driver);
		h12.clickLoginRegister();
		Thread.sleep(2000);
		h12.enteremail(un);
		Thread.sleep(2000);
		h12.enterpassword(pw);
		Thread.sleep(2000);
		h12.clickloginBTN();
		Thread.sleep(2000);
		h12.clickSkip();
		Thread.sleep(2000);
		h12.hoverHomeandKitchen(driver);
		h12.clickCurtains();
		CurtainsPage c8=new CurtainsPage(driver);
		c8.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c8.clickSearchBTN();
		c8.clickProdName();
		ProductDetailsPage p9=new ProductDetailsPage(driver);
		p9.clickBuyNow(driver);
		ReviewPage r1=new ReviewPage(driver);
		r1.clickProceedtoPayments();
		PaymentPage p1=new PaymentPage(driver);
		p1.switchToframe(driver);
		p1.entercardno(creditcardno);
		Thread.sleep(2000);
		p1.enterMM(month);
		Thread.sleep(2000);
		p1.enterYY(year);
		Thread.sleep(2000);
		p1.enterCVV(cvv);
		Thread.sleep(2000);
		p1.entercardname(name);
		Thread.sleep(2000);
		p1.verifyInvalidCC();
	}

}
