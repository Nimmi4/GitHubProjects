package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Demoscroll extends TestMethodSetup{
    
	@Test
	public void Scrollbar()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.demoguru99scrollurl);
			cf.scrollbyJavascript();
			cf.scrollAndViewElementbyJavascript(OR.certificationscroll);
			cf.capturescreenshot();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
