package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	
	@FindBy(id="proceed_to_payment_button")
	private WebElement ProceedtoPayment;
	
	public ReviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickProceedtoPayments()
	{
		ProceedtoPayment.click();
	}

}




