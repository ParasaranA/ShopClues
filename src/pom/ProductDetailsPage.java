package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductDetailsPage {
	
	@FindBy(xpath="//button[@id='add_cart']")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//span[@class='cart_icon_count']")
	private WebElement Carticon;
	
	@FindBy(xpath="//span[contains(text(),'iLiv Plain Eyelet Curtain 9 Feet')]")
	private WebElement Cartitem;
	
	@FindBy(id="buy")
	private WebElement BuyNow;
	
public ProductDetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

 public void clickaddtocart(WebDriver driver)
 {   
	 ArrayList<String> whs = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(whs.get(2));
	 AddtoCart.click();
 }
 
 public void hoverCarticon(WebDriver driver)
 {
	 Actions actions=new Actions(driver);
	 actions.moveToElement(Carticon).perform();
	 
 }
 
 public void clickCarticon(WebDriver driver,long time)
 {
	 WebDriverWait wait=new WebDriverWait(driver,time);
	 wait.until(ExpectedConditions.visibilityOf(Carticon)).click();
	 
 }
 
 public void verifyCartitemDisplay(WebDriver driver,long time)
 {
	 WebDriverWait wait=new WebDriverWait(driver,time);
	 try{
		 wait.until(ExpectedConditions.visibilityOf(Cartitem));
		 Reporter.log("PASS :Cart item is displayed", true);
	 }
	 catch(Exception e)
	 {
		 Reporter.log("FAIL :Cart item is NOT displayed" , true);
		 Assert.fail();
	 }
	
}
 
 public void clickBuyNow(WebDriver driver)
 {
	 ArrayList<String> whs = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(whs.get(2));
	 BuyNow.click();
 }
}
