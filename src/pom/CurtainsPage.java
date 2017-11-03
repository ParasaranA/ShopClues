package pom;

import java.util.ArrayList;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurtainsPage {
	
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement Searchbox;
	
	@FindBy(xpath="//a[@class='srch_action btn orange']")
	private WebElement SearchBTN;

	@FindBy(xpath="//h3[contains(text(),'iLiv Plain Eyelet Curtain 9 Feet')]")
	private WebElement ProdName;
	
public CurtainsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void searchProd(String prod,WebDriver driver)
{
	ArrayList<String> whs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(whs.get(1));
	Searchbox.sendKeys(prod);
}

public void clickSearchBTN()
{
	SearchBTN.click();
}
	
public void clickProdName()
	{
		
		ProdName.click();
		
	}
	 

}
