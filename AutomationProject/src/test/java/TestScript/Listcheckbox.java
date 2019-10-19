package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Listcheckbox extends TestMethodSetup {
@Test
	public void ListTextbox()
	{
		CommonFunctions cf = new  CommonFunctions();
		cf.OpenUrl("http://www.echoecho.com/htmlforms09.htm");
		cf.selectmultiplecheckbox(OR.multiplecheckbox);
		cf.selectmultiplecheckbox(OR.multiplecheckbox1);
	}
	
}
