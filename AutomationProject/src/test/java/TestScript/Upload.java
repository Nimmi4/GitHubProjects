package TestScript;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Upload extends TestMethodSetup {

	public void testcases()
	{
		
		try {
			CommonFunctions cf= new CommonFunctions();
			cf.OpenUrl(OR.interneturl1);
			cf.click(OR.choosefile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
