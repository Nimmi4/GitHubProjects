package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Facebook extends TestMethodSetup {

	CommonFunctions cf = new CommonFunctions();
	@Test
	public void facebooklogin() {
		try {
			cf.OpenUrl(OR.Facebookurl);
			//cf.enterdatabyAction(OR.facebookusername,"abcd123");
			cf.clickbypressingtabandeneterkey(OR.facebookpassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
