package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {

	public WebDriver driver;
	
	static{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			System.setProperty(GECKO_KEY, GECKO_VALUE);
		}
		
	@BeforeMethod
	public void openApp()
	{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	

}
