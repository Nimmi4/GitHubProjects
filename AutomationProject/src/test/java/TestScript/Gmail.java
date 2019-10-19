package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Gmail extends TestMethodSetup {

	CommonFunctions cf = new CommonFunctions();
	@Test
	public void gmailtestcase()
	{
		try {
			cf.OpenUrl(OR.gmailaccount1);
			
			cf.verificationResult("Create your Google Account", "Create your Google Account");
			cf.verificationResult("Continue to Gmail","Continue to Gmail");
			cf.enterinmultipletextbox(OR.enterfirstname_lastname_gmailaccount,"namrata");
			
			cf.checkobjectattribute(OR.gmaillogo,"width");
		cf.checkcolor(OR.gmaillogo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
