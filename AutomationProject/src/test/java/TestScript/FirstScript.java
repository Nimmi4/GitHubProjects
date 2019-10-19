package TestScript;

import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class FirstScript extends TestMethodSetup {

	
	CommonFunctions cf= new CommonFunctions();
	@Test
	public void testReport()
	{
		try {
			log.info("testcase started");
			cf.OpenUrl("https://login.yahoo.com/account/create?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp%26guce_referrer%3DaHR0cHM6Ly9jYS55YWhvby5jb20vP3A9dXM%26guce_referrer_sig%3DAQAAAD7gBeq9e_8WIRNOgLcAmlU36iDrSwouacpt0Nk0fJUhjEzmMrUym2d6Wx7ub5t2mQjbQTU4szZSwtlE5HDExScuqZ5rr6lZuRVa5hyd3DCNywel_UNuHyFtXDmB2tKgZosf0Tse9Pen-VNyIuw2EmVyqd3mkrxUF7IemrZEe33k&.partner=none&specId=yidReg");
			log.info("url entered");
			
			
			
			cf.enterdata(OR.WrongFirstname, "nimmi");
			
			/*
			 * cf.enterdata(OR.Lastname, "kang");
			 * 
			 * 
			 * cf.enterdata(OR.Emailaddress,"nimmikang31" );
			 * 
			 * 
			 * cf.enterdata(OR.password,"testing123");
			 * 
			 * 
			 * cf.dropdown(OR.BirthMonth, "Jan");
			 * 
			 * cf.enterdata(OR.day, "9");
			 * 
			 * 
			 * cf.enterdata(OR.year, "1978");
			 * 
			 * 
			 * cf.enterdata(OR.Gender, "Female");
			 */
			
			String actual=cf.getText(OR.SignupHeader);
			cf.verificationResult(actual, "Sign up for Yahoo Mail");
		
			String actual1 =cf.getText(OR.footer);
			cf.verificationResult(actual1, "Privacy Policy");
			
			  
			
			
			log.info("test case ended");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		
		
		
	}
}
