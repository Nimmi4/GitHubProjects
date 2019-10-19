package TestScript;

import util.CommonFunctions;
import util.TestMethodSetup;
import org.testng.annotations.*;

import ObjectRepository.OR;
public class DemoGuru99 extends TestMethodSetup {

	
	@Test
	public void Testcase()
	{
		try {
			CommonFunctions cf= new CommonFunctions();
			log.info("testcase started");
		 cf.OpenUrl(OR.Guru99url);
		 String mainwindow=cf.MainWindow();
		 cf.click(mainwindow);
		 cf.click(OR.TelecomProject);
		 
		 cf.moveToNewWindow();
		 cf.click(OR.Addcustomerbutton);
	     cf.click(OR.donebutton);
		 
		 cf.moveToMainWindow(mainwindow);
		 cf.click(OR.Guru99loginbutton);
		 cf.handleAlert();
		 
		 
		 
		 
		 
		 cf.click(OR.submitbutton);
			cf.handleAlert();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
