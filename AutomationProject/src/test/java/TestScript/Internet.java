package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Internet extends TestMethodSetup{
@Test
	public void Testcase()
	{
		try {
			CommonFunctions cf= new CommonFunctions();
		 cf.OpenUrl(OR.Interneturl);
		 cf.draganddrop(OR.A,OR.B);
		 cf.draganddrop(OR.B,OR.A ); 	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
