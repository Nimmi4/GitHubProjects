package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Windowhandles extends TestMethodSetup {

	CommonFunctions cf = new CommonFunctions();	
	@Test
	public void multiplewindows()
	{
		try {
			
			cf.OpenUrl(OR.cheapflightmainwindowurl);
			cf.moveToNewWindow();
						
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}
