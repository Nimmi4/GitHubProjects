package TestScript;

import org.testng.annotations.Test;

import util.CommonFunctions;
import util.TestMethodSetup;

public class Testcase01forxlsreading extends TestMethodSetup{

	@Test
	public void xls()
	{
		try {
			//CommonFunctions cf = new CommonFunctions();
			//cf.readxlsFile("data.xlsx",0);
			CommonFunctions cf = new CommonFunctions();
			cf.readxlsFileWithList("data.xlsx",0);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
