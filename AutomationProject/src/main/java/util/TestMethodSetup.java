package util;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class TestMethodSetup {
	
	public static WebDriver driver=null;
	public static Logger log=Logger.getLogger(TestMethodSetup.class);
	@BeforeSuite
	public void openBrowser()
	{
		String log4jPath=System.getProperty("user.dir")+"\\log4j.properties";
		PropertyConfigurator.configure(log4jPath);
		
		String projectPath=System.getProperty("user.dir")+"\\testing.properties";
		
		
		System.out.println("Startee Testmethod!!");
		
		try {
			FileInputStream file=new FileInputStream(projectPath);
			Properties prop=new Properties();
			prop.load(file);
			String driverPath=System.getProperty("user.dir")+"\\driver";
			 String browserValue= prop.getProperty("browsername");
			 
			 if (browserValue.equals("chrome")) {
				 
					 System.setProperty("webdriver.chrome.driver", driverPath+"\\chromedriver.exe");
					 driver=new ChromeDriver();
					 driver.manage().window().maximize();
				
			} else if(browserValue.equals("ie")){

			}
			else if(browserValue.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", driverPath+"\\geckodriver.exe");
				driver=new FirefoxDriver();
				 driver.manage().window().maximize();

				

			}
			else {
				
				System.out.println("Please check your Testing.properties!!");

			}
			
			
		} catch (Exception e) {
             e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
