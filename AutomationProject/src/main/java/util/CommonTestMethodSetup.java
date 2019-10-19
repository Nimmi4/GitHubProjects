package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.utils.FileUtil;

public class CommonTestMethodSetup extends TestMethodSetup {

	
	public void CaptureScreenshot()
	{
		try {
			String path = System.getProperty("User.dir")+"\\images\\jpeg";
			TakesScreenshot scr= ((TakesScreenshot)driver);
			File scrFile=scr.getScreenshotAs(OutputType.FILE);
		   File destFile= new File(path);
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
