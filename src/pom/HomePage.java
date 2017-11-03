package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage {
	
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[23]")
	private WebElement HomeandKitchen;
	
	@FindBy(linkText="Curtains")
	private WebElement Curtains;
	
	@FindBy(linkText="Sign In")
	private WebElement SignIn;
	
	@FindBy(xpath="(//a[@onclick='loginPopup();'])[1]")
	private WebElement LoginRegister;

	@FindBy(id="main_user_login")
	private WebElement Emailid;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(id="login_button")
	private WebElement Loginbtn;
	
	@FindBy(linkText="Skip")
	private WebElement Skip;
	
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[7]")
	private WebElement verifySignIn;
	
	@FindBy(xpath="(//span[@class='error_span_text password_err'])[1]")
	private WebElement errormsg;
	
	@FindBy(linkText="Hi parasara")
	private WebElement AfterSignIn;
	
	@FindBy(xpath="//i[@class='usr_signout']")
	private WebElement SignOut;
	
	@FindBy(xpath="(//a[@onclick='loginPopup();'])[1]")
	private WebElement verifySignOut;

	
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void hoverHomeandKitchen(WebDriver driver)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(HomeandKitchen).perform();
}

public void clickCurtains()
{
	Curtains.click();
}

public void hoverSignIn(WebDriver driver)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(SignIn).perform();
}

public void clickLoginRegister()
{
	LoginRegister.click();
}

public void enteremail(String email)
{
	Emailid.sendKeys(email);
}

public void enterpassword(String pwd)  
{
	Password.sendKeys(pwd);
}

public void clickloginBTN()
{
	Loginbtn.click();
}
public void clickSkip()
{
	Skip.click();
}

public void verifySignIn(WebDriver driver,long time){
	WebDriverWait wait=new WebDriverWait(driver, time);
	try{
		wait.until(ExpectedConditions.visibilityOf(verifySignIn));
		Reporter.log("PASS:Login Successful", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL :Login Unsuccesful", true);
		Assert.fail();
	}
}

public void verifyErrorMsg(WebDriver driver,long time)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try{
	wait.until(ExpectedConditions.visibilityOf(errormsg));
	Reporter.log("PASS: Error message is displayed", true);
    }
	catch(Exception e)
	{
		Reporter.log("FAIL :Error message is not displayed", true);
		Assert.fail();
	}
}
public void hoverAfterSignIn(WebDriver driver)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(AfterSignIn).perform();
}
public void clickSignout()
{
	SignOut.click();
}

public void verifySignOut(WebDriver driver,long time)

{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try{
		wait.until(ExpectedConditions.visibilityOf(verifySignOut));
		Reporter.log("PASS:Logout Successful", true);
	}
	catch(Exception e)
	{
		Reporter.log("FAIL :Logout Unsuccesful", true);
		Assert.fail();
	}
	
}



}
