package TestScript;
import org.testng.annotations.*;

import ObjectRepository.OR;
import junit.extensions.TestSetup;
import util.CommonFunctions;
import util.TestMethodSetup;

public class BankOfCanada extends TestMethodSetup {

	CommonFunctions cf= new CommonFunctions();
	@Test
	public void Testcase()
	{
		try {
			log.info("fourth testcases started");
			cf.OpenUrl(OR.Bankurl);
			log.info("url entered");

			cf.mousehoverAndClick(OR.AbouttheBank);
			cf.mousehover(OR.statisticlink);
			
			String actual1 = cf.getText(OR.bankurllogo);
			cf.verificationResult(actual1,"Home");
			
			cf.click(OR.searchlogo);
			
			cf.click(OR.languagelogo);
		 cf.navigatebackpage();
		 cf.click(OR.Corefunctions);
		 cf.click(OR.FeaturedLinks);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
	}
	
	
}
