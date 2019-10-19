package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Doubleclick extends TestMethodSetup {

	
	
	@Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			
			cf.OpenUrl(OR.doublickurl);
			cf.moveToFrame(OR.iframe);
			cf.doubleclick(OR.doubleclick);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
