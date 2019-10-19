package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Cheapflight extends TestMethodSetup {

	CommonFunctions cf= new CommonFunctions();
	@Test
	public void Testcases() throws InterruptedException
	{
		cf.OpenUrl(OR.Cheapflighturl);
		cf.enterdata(OR.Typeintofromfield,"DXB - Dubai, United Arab Emirates");
		cf.enterdata(OR.Typeintotofield,"AMD - Ahmedabad, India");
		cf.click(OR.calendericon);
		cf.click(OR.Departmentcalenderdate);
		
		
		/*cf.enterdata1(OR.Departmentcalenderdate,31);
     System.out.println(driver.findElement(By.tagName("a")).getSize());
		cf.dropdown(OR.Adultsdropdown,"2");		
		cf.click(OR.Signinbutton);
		
		cf.click(OR.Signinbuttonflight);
		Thread.sleep(5000);
		cf.clickdirectActions(OR.Registerbutton);
		
		Thread.sleep(5000);
		
		cf.navigatebackpage();
		cf.mousehover(OR.morebuttonflight);
	
		cf.click(OR.Searchbuttonflight);
		cf.dismissAlert();
		cf.navigateforwardpage();
		Thread.sleep(5000);
		cf.clickusingJavascript(OR.hotelstab);
        cf.navigatebackpage();
        cf.navigatebackpage();
       // cf.enterdata(OR.fromtextbox,"ca");
        cf.enterdata(OR.fromegypt,"CAI - Cairo, Egypt");
       // cf.enterdata(OR.fromtextbox,"Keys.DOWN");
   //cf.enterdata(OR.fromtextbox,"ca");
		//cf.dropdown(OR.destinationtextbox,"Atlanta, Georgia, United States");
		
		
		//cf.getAttributeValue(OR.destinationtextbox,"name");
/* String	actual1= cf.getText(OR.cheapflighttitle);
 cf.verificationResult(actual1,"CheapOair.ca");*/
		
		
		
	}
	
	
	
}
