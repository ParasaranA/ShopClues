package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class MyCartPage {
	@FindBy(xpath="//a[@class='plus']")
	private WebElement PlusBTN;
	
	@FindBy(xpath="//input[@class='no edit-prod-text']")
	private WebElement IncreaseNumber;
	
	@FindBy(xpath="//a[@class='minus']")
	private WebElement MinusBTN;
	
	@FindBy(xpath="//input[@class='no edit-prod-text']")
	private WebElement DecreaseNumber;
	
	@FindBy(linkText="Remove")
	private WebElement Removelink;
	
	@FindBy(xpath="(//a[.='Remove'])[1]")
	private WebElement Remove;
	
	@FindBy(xpath="(//p)[1]")
	private WebElement AfterDeleteText;
	
	@FindBy(linkText="iLiv Plain Eyelet Curtain 9 Feet ( Set Of 3 )Cream & Pink")
	private WebElement Cartitem;
	
public MyCartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickPlusBTN()
{
	PlusBTN.click();
}

public void clickMinusBTN()
{
	MinusBTN.click();
}

public void verifyIncreaseItems(WebDriver driver,long time)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(IncreaseNumber));
		Reporter.log("PASS : Quantity of items increased", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL : Quantity of items NOT increased", true);
		Assert.fail();
	}
	
}

public void verifyDecreaseItems(WebDriver driver,long time)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(DecreaseNumber));
		Reporter.log("PASS : Quantity of items decreased", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL : Quantity of items NOT decreased", true);
		Assert.fail();
	}

}

public void clickRemoveLink()
{
	Removelink.click();
}

public void clickRemove()
{
	Remove.click();
}

public void verifyItemDeleted(WebDriver driver,long time)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(AfterDeleteText));
		Reporter.log("PASS : Cart Item is Deleted", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL : Cart item is not deleted", true);
		Assert.fail();
	}
}

public void verifyCartItemDisplay(WebDriver driver,long time)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(Cartitem));
		Reporter.log("PASS : Cart item added is displayed", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL : Cart item added is NOT displayed", true);
		Assert.fail();
	}
	
	
}

}
