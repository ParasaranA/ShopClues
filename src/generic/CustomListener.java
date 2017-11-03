package generic;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener ,IAutoConst {
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		try {
			Robot rob= new Robot();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRect = new Rectangle(dim);	
			BufferedImage img = rob.createScreenCapture(screenRect);
			SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
			String today = s.format(new Date());
			ImageIO.write(img, "png", new File(PHOTOPATH+testName+today+".png"));
			Reporter.log("Screenshot Taken Successfuly",true);
		}
		catch(Exception exp)
		{
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
