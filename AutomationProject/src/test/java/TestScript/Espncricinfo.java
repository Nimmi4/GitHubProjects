package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Espncricinfo extends TestMethodSetup {

	
	CommonFunctions cf = new CommonFunctions();
	@Test
	public void Scores()
	{
		try {
			cf.OpenUrl(OR.espncricinfourl);
		int output=	cf.fetchandVerifyResult(OR.gridrunxpath);
		System.out.println("total run scored by first team : "+output);
		int extrarun=cf.fetchruntext(OR.EXTRARUNXPATH);
		System.out.println("Extra run :"+extrarun);
		
	int totalrun=	cf.fetchruntext(OR.Totalxpath);
	System.out.println("total run:"+totalrun);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
