package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Spicejetmultiplebox extends  TestMethodSetup{
     @Test
	public void multiplecheckbox()
	{
		try {
			CommonFunctions cf = new CommonFunctions();
			cf.OpenUrl(OR.Spicejeturl);
			//cf.click(OR.seniorcitizen);
			
       //cf.checkboxisselected(OR.seniorcitizen);	
       //cf.sizeofcheckbox(OR.checkbox);  
//cf.capturescreenshot();
		/*cf.selectmultiplecheckboxandradiobutton(OR.multiplecheckboxspicejet);	
		cf.sizeofcheckbox(OR.multiplecheckboxspicejet);
		cf.checkelementenableordisbaled(OR.multiplecheckboxspicejet);
		cf.selectmultiplecheckboxandradiobutton(OR.multipleradiobutton);
		cf.click(OR.clickokbuttonspicejet);
		cf.click(OR.calenderspice);
		cf.click(OR.calendernovember);
		cf.clickusingJavascript(OR.novemberdate);
		cf.verificationResult("Login / Signup","Login / Signup");
		cf.capturescreenshot();
		cf.click(OR.departurecitydropdown);
		cf.sizeofcheckbox(OR.dropdowns);
		cf.click(OR.Fromintotextbox);
		cf.checkcolor(OR.flightlogo);
		cf.capturescreenshot();*/
		cf.clickdirectActions(OR.fromtextbox);	
		cf.dropdown(OR.durgapurdropdown,"durgapur");
		cf.dropdown(OR.currencydropdown,"AED");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
