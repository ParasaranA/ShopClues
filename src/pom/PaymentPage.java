package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class PaymentPage {

	
	@FindBy(id="cc_number")
	private WebElement entercardno;
	
	@FindBy(name="expiry_month")
	private WebElement MM;
	
	@FindBy(name="expiry_year")
	private WebElement YY;
	
	@FindBy(xpath="//input[@placeholder='CVV']")
	private WebElement CVV;
	
	@FindBy(name="card_name")
	private WebElement Cardname;
	
	@FindBy(xpath="//span[@style='display: block;']")
	private WebElement errmsg;
	
	@FindBy(xpath="//button[contains(text(),'Pay ₹ ')]")
	private WebElement PayBTN;
	
public PaymentPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void switchToframe(WebDriver driver)
{
	driver.switchTo().frame(0);
}
public void entercardno(String c)
{
	entercardno.sendKeys(c);
}

public void enterMM(String m)
{
	MM.sendKeys(m);
}

public void enterYY(String y)
{
	YY.sendKeys(y);
}

public void enterCVV(String cvv)
{
	CVV.sendKeys(cvv);
}

public void entercardname(String n)
{
	Cardname.sendKeys(n);
}

public void clickPayBTN()
{
	PayBTN.click();
}

public void verifyInvalidCC()
{
	if(errmsg.isDisplayed())
	{
		Reporter.log("PASS:Error message displayed for invalid CC no", true);
	}
	else
	{
		Reporter.log("FAIL:Error message is not displayed for invalid CC no", true);
		Assert.fail();
	}
}

public void verifyInvalidCardName()
{
	if(errmsg.isDisplayed())
	{
		Reporter.log("PASS:Error message displayed for invalid Card Name", true);
	}
	else
	{
		Reporter.log("FAIL:Error message is not displayed for invalid Card Name", true);
		Assert.fail();
	}
}

public void verifyInvalidCVV()
{
	if(errmsg.isDisplayed())
	{
		Reporter.log("PASS:Error message displayed for invalid CVV", true);
	}
	else
	{
		Reporter.log("FAIL:Error message is not displayed for invalid CVV", true);
		Assert.fail();
	}
}
	

}
