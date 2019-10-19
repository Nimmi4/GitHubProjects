package TestScript;



import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Uploadfiledemo extends TestMethodSetup {

	@Test
	public void uploadfile()
	{
		CommonFunctions cf= new CommonFunctions();
		cf.OpenUrl(OR.demositeguru99url);
		cf.uploadfile(OR.uploadfiledemo,"C:\\Users\\Namrata\\Geek Squad Setup Guide.pdf");
		cf.click(OR.submit_button);
		
		
		
		
	}
}
