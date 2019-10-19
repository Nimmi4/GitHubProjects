package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Translink extends TestMethodSetup {

	@Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.TranslinkUrl);
		
			String actual =cf.getAttributeValue(OR.Translinktitle,"alt");
			cf.verificationResult(actual,"TransLink");
			
			cf.enterdata(OR.Translinktextbox,"bustiming");
			cf.click(OR.TranslinkSearch);
		
			cf.mousehoverAndClick(OR.SchedulesandMaps);
		
			cf.mousehoverAndClick(OR.fares);
			Thread.sleep(5000);
			cf.click(OR.Translinkbreadcrumlink);
			cf.click(OR.tripplanner);
			cf.clickdirectActions(OR.Nextbus);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
