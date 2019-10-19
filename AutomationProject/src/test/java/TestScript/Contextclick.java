package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Contextclick extends TestMethodSetup
{
@Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.contextclickurl);
			cf.rightclick(OR.Rightclickmebutton);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}