package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class Amazon extends TestMethodSetup{

	CommonFunctions cf = new CommonFunctions();
	@Test
	public void testcase()
	{
		log.info("second testcase started");
		try {
			cf.OpenUrl(OR.Amazonurl);
		log.info("url entered");
		
		
		cf.enterdata(OR.Searchbox,"mac laptop");
		cf.click(OR.SearchClick);
		cf.mousehover(OR.ENdropdown);
		Thread.sleep(5000);
		cf.click(OR.DEdropdown);
		
		//cf.click(OR.);
		
/*		String actual=cf.getText(OR.Amazontitle);
		cf.verificationResult(actual,"amazon.ca");*/
	
		/*String actual1 =cf.getText(OR.footer);
		cf.verificationResult(actual1, "Privacy Policy");*/
		
		/*cf.enterdata(OR.Searchbox,"dell computers");
		cf.click(OR.SearchClick);
		
       cf.clickdirectActions(OR.Renownedelectronics);
       
        String actual9=cf.getText(OR.Renownedverifytext);
       cf.verificationResult(actual9,"Shop Refurbished, Pre-Owned, and Open-Box Products on Amazon Renewed");
       
	
		
		String actual =cf.getText(OR.header1);
		cf.verificationResult(actual,"Deliver to");
		
	
		
		//cf.click(OR.ArrowKey);
		
		cf.click(OR.header1);
		Thread.sleep(3000);
		
		
		cf.enterdata(OR.postalbox1, "V3d");
		cf.enterdata(OR.postalbox2, "2y8");
		cf.clickusingActions(OR.postalbox2);
		//cf.getText(OR.messagedialogbox);
		
		/*String actual5 =cf.getText(OR.messagedialogbox);
		cf.verificationResult(actual5, "You're now shopping for delivery to:");*/
		cf.clickdirectActions(OR.continuebutton);
		
		/*String actual1=cf.getText(OR.header2);
		String  s1=actual1.trim();
		cf.verificationResult(s1,"Surrey V3S");*/
		
		
		//String actual1=cf.getText(OR.Signin);
		//cf.verificationResult(actual1, "Hello, Sign in");
		
     
	
		
		//String actual2= cf.getText(OR.AccountandLists);
		//cf.verificationResult(actual2, "Account & Lists");
	
		
		//cf.clickdirectActions(OR.Orders);
		
	/*	cf.mousehover(OR.ENdropdown);
		cf.mousehoverAndClick(OR.frenchradiobuttonclick);
		cf.mousehover(OR.Try);
		cf.mousehover(OR.Prime);	
		cf.dropdown(OR.Alldropdown,"search-alias=warehouse-deals");
	
		
		
		String actual7 =cf.getText(OR.Department);
		
		cf.verificationResult(actual7, "Department");
		
		cf.clickdirectActions("//div[@id='reviewsRefinements']//ul/li//i");
		
  /*String actual6 =cf.getText(OR.Amazonimg);
  cf.verificationResult(actual6, "");*/
		
  
  
  log.info("test case ended");
		
		
		/*cf.mousehover(OR.TryPrime);*/
		
	/*	String actual3 = cf.getText(OR.LaptopHeader);
		cf.verificationResult(actual3, "2016 Dell Optiplex 7010 Business Desktop Computer (Intel Quad Core i5 up to 3.8GHz Processor), 8GB RAM, 500GB HDD, DVD, Windows 10 Professional (Renewed)");
		
		
		cf.click(OR.BugAgain);
		
	String actual4= cf.getText(OR.Tioletpaper);
	cf.verificationResult(actual4, "CDN$ 117.35");
	
	
	
	cf.click(OR.AddtoCart);*/
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
}
