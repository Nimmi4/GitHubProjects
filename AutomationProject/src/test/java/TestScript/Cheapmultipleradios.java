package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Cheapmultipleradios extends TestMethodSetup {
	
	@Test
	public void radios()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.cheapflightmultipleradio);
			cf.Selectallcheckbox(OR.multiplecheapradiobuttons);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
