package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Uploadfile extends TestMethodSetup {
     @Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.yahoourl);
			Thread.sleep(5000);
			//String mainwindow=cf.MainWindow();
			cf.enterdata(OR.enterusername,"testingselenium40@yahoo.com");
			//cf.clickdirectActions(OR.nextbutton);
			cf.clickusingJavascript(OR.nextbutton);
			Thread.sleep(5000);
			//cf.moveToMainWindow(mainwindow);
			cf.enterdata(OR.enterpassword,"!@#qazwsxedc");
			cf.clickusingJavascript(OR.signinbuttonyahoo);
			cf.enterdata(OR.enteryahoocode,"25");
			cf.clickusingJavascript(OR.submityahoo);
			//cf.click(OR.compose);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
