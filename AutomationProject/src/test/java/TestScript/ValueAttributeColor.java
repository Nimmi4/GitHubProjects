package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class ValueAttributeColor extends TestMethodSetup{
@Test
public void valueattribute()
{
	try {
		CommonFunctions cf = new CommonFunctions();
		
		cf.OpenUrl(OR.mavenrepository);
		cf.checkobjectattribute(OR.apachepoiimage,"src");
	    cf.checkcolor(OR.apachepoiimage);
	} catch (Exception e) {
		
		// TODO: handle exception
	}
	}
	
	
}
