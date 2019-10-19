package report;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import util.CommonFunctions;

public class Listners extends TestListenerAdapter {
	
	
	public ExtentHtmlReporter htmlreport;// it is used to create report file in my localsysytem and also it is used for seting document 
	//title and report name
	
	public ExtentReports extent;//it is used for setting system information where i have exceuted my testcase
	public ExtentTest test;//it is used for setting testcase pass, fail, skip.
	
	
	public void onStart(ITestContext testcontext)
	{
		String path=System.getProperty("user.dir")+"\\Logs\\testreport.html";
		htmlreport=new ExtentHtmlReporter(path);
		htmlreport.config().setDocumentTitle("Automation Report Test");
		htmlreport.config().setReportName("Automation report");
		htmlreport.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		
		extent.setSystemInfo("ProjectName", "Test");
		extent.setSystemInfo("HostName", "Localhost");

		extent.setSystemInfo("Env", "TestEnv");

		extent.setSystemInfo("User", "Namrata");

		
	}
	public void onTestSuccess(ITestResult result)
	{
		
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Passed "+result.getName());
		
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Failed "+result.getName());
		
	}
	public void onTestSkipped(ITestResult result)
	{
		
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped "+result.getName());
		
	}
	
	public void addscreenshot(ITestContext result) throws IOException
	{
		
		if(result.toString().toLowerCase().equals("fail"))
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Skipped "+result.getName()+""+test.addScreenCaptureFromPath(CommonFunctions.capturescreenshotForReport()));
		
		
	}
	
	
	
	public void onFinish(ITestContext testContext)
	{
	extent.flush();	
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
