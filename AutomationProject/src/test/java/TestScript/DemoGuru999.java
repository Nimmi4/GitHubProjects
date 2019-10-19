package TestScript;

import util.CommonFunctions;
import util.TestMethodSetup;
import org.testng.annotations.*;

import ObjectRepository.OR;
public class DemoGuru999 extends TestMethodSetup {

	
	@Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.Guru999url);
			String mainwindow=cf.MainWindow();
			
			cf.click(OR.Clickherebutton);
			
			cf.moveToNewWindow();
			
			String actual = cf.getText(OR.enteryouremail);
			cf.verificationResult(actual,"Enter your email address to get\naccess details to demo site");
			
			cf.moveToMainWindow();
			cf.click(OR.Clickherebutton);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
