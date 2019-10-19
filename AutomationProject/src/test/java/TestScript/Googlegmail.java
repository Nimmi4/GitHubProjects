package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Googlegmail extends TestMethodSetup {
	
	CommonFunctions cf= new CommonFunctions();
     @Test
	public void scroll()
	{
    	 try {
			cf.OpenUrl(OR.googlegmail);
			cf.scrollAndViewElementbyJavascript(OR.deletebutton);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
