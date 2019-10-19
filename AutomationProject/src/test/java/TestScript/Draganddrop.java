package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Draganddrop extends TestMethodSetup{

	
	@Test
	public void testcase()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			
			cf.OpenUrl(OR.url);
			cf.draganddrop(OR.dragbutton, OR.dropbutton);
			
			String actual =cf.getText(OR.verifydraganddrop);
			cf.verificationResult(actual,"5000");
			
			cf.draganddrop(OR.creditdragbutton,OR.dropbutton);
		  
			String actual1=cf.getText(OR.verifycreditmovement);
			cf.verificationResult(actual,"5000");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
