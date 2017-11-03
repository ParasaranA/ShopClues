package script;

import org.testng.annotations.Test;

import pom.CurtainsPage;
import pom.HomePage;
import pom.PaymentPage;
import pom.ProductDetailsPage;
import pom.ReviewPage;
import generic.BaseTest;
import generic.Lib;

public class VerifyInvalidCVVErrorMsg extends BaseTest {
	
	@Test(priority=15)
	public void testInvalidCVVErrorMsg() throws InterruptedException
	{  
		String un=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 1);
	    String pw=Lib.getCellvalue(XLPATH, "ValidLogin", 1, 2);
		String creditcardno=Lib.getCellvalue(XLPATH,"CreditCardDetails", 3, 0);
		String month=Lib.getCellvalue(XLPATH,"CreditCardDetails", 3, 1);
		String year=Lib.getCellvalue(XLPATH,"CreditCardDetails", 3, 2);
		String cvv=Lib.getCellvalue(XLPATH,"CreditCardDetails", 3, 3);
		String name=Lib.getCellvalue(XLPATH,"CreditCardDetails", 3, 4);
		HomePage h14=new HomePage(driver);
		h14.hoverSignIn(driver);
		h14.clickLoginRegister();
		Thread.sleep(2000);
		h14.enteremail(un);
		Thread.sleep(2000);
		h14.enterpassword(pw);
		Thread.sleep(2000);
		h14.clickloginBTN();
		Thread.sleep(2000);
		h14.clickSkip();
		Thread.sleep(2000);
		h14.hoverHomeandKitchen(driver);
		h14.clickCurtains();
		CurtainsPage c10=new CurtainsPage(driver);
		c10.searchProd("iLiv Plain Eyelet Curtain 9 Feet", driver);
		c10.clickSearchBTN();
		c10.clickProdName();
		ProductDetailsPage p11=new ProductDetailsPage(driver);
		p11.clickBuyNow(driver);
		ReviewPage r3=new ReviewPage(driver);
		r3.clickProceedtoPayments();
		PaymentPage p3=new PaymentPage(driver);
		p3.switchToframe(driver);
		p3.entercardno(creditcardno);
		Thread.sleep(2000);
		p3.enterMM(month);
		Thread.sleep(2000);
		p3.enterYY(year);
		Thread.sleep(2000);
		p3.enterCVV(cvv);
		Thread.sleep(2000);
		p3.entercardname(name);
		Thread.sleep(2000);
		p3.verifyInvalidCVV();
		
	}

}
