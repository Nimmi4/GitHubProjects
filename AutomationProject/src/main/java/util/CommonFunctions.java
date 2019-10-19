package util;
 import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;
import org.testng.Assert;

public class CommonFunctions extends TestMethodSetup{
	
	public Object OpenUrl;
	private int sheetindex;

	public void OpenUrl(String url)
	{
 try {
	driver.get(url);
} catch (Exception e) {
	e.printStackTrace();
}	

	}
//this methos is used for clicking multiple(checkbox,radiobutton,buttons,links)
	public void selectmultiplecheckbox(String Xpath)
	{
	try {
     List<WebElement> li = driver.findElements(By.xpath(Xpath));
		for(int i=0; i<li.size();i++ )
		{
			
			boolean flag=li.get(i).isSelected();
			if(flag)
			{
				log.info("already clicked checkbox");
				
			}
			else {
		 li.get(i).click();
		 log.info("successfully checked on multiple checkbox");
			}
		}
	} catch (Exception e) {
		log.info("couldnot click on checkbox");
		// TODO: handle exception
	}	
	}
	
	public void checkboxisselected(String Xpath)
	{
		try {
	boolean ch=	driver.findElement(By.xpath(Xpath)).isSelected();
	if(ch) {
		
	
	
		log.info("checkbox is selected");}
	else {
		log.info("checkbox is not selected"+false);
		//driver.findElement(By.xpath(Xpath)).click();
		}
	}
		 catch (Exception e) {
			log.info("Exception occured");
			// TODO: handle exception
		}
	}
	
	public void Selectallcheckbox(String Xpath)
	{
		try {
	List<WebElement> list=driver.findElements(By.xpath(Xpath));
int size=list.size();
log.info("checkbox size "+size);
	
			
		} catch (Exception e) {
			log.info("checkbox size is not determined");
			// TODO: handle exception
		}
	}
	
	public void scrollbyJavascript()
	{
		
		try {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			log.info("successfully screen scrolled");
		} catch (Exception e) {
			log.info("screen cannot scrolled");
			// TODO: handle exception
		}
		
	}
	
	public void scrollAndViewElementbyJavascript(String Xpath)
	{
		
		try {
			WebElement ele=driver.findElement(By.xpath(Xpath));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",ele);
			log.info("find an element after scrolling");
			
		} catch (Exception e) {
			log.info("couldnt find an element after scrolling");
			// TODO: handle exception
		}
	
	}
	
	public void capturescreenshot()
	{
		try {
			int number=randomnumber();
			String path=System.getProperty("user.dir")+"\\Images\\test+"+number+".jpeg";
			TakesScreenshot scr=((TakesScreenshot)driver);
			File scrfile=scr.getScreenshotAs(OutputType.FILE);
			File destfile=new File(path);
			FileUtils.copyFile(scrfile, destfile);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static String capturescreenshotForReport()
	{
		String imagePath="";
		try {
			String path=System.getProperty("user.dir")+"\\Images\\test.jpeg";
			TakesScreenshot scr=((TakesScreenshot)driver);
			File scrfile=scr.getScreenshotAs(OutputType.FILE);
			File destfile=new File(path);
			FileUtils.copyFile(scrfile, destfile);
			imagePath=destfile.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return imagePath;
		
	}
	
	
	
	
	public void sizeofcheckbox(String Xpath)
		{
		try {
		int size=driver.findElements(By.xpath(Xpath)).size();
			log.info("size is determined "+size);
		} catch (Exception e) {
			log.info("size is not determined");
			// TODO: handle exception
		}
	}
	public void enterdata(String Xpath,String data)
	{
		try {
		driver.findElement(By.xpath(Xpath)).sendKeys(data);
		log.info("data entered"+data);
		} catch (Exception e) {
			log.info("data not selected"+data+""+e.getMessage());
			e.printStackTrace();
			
		}
	} 
	
	
	public int fetchruntext(String Xpath)
	{
		int finalresult=0;
		try {
			
	String value=driver.findElement(By.xpath(Xpath)).getText();
  String result[]=value.split("\\(");
  String result1=result[0].trim();
  finalresult=Integer.parseInt(result1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return finalresult;
	}
	
	
	
	public int fetchandVerifyResult(String Xpath)
	{
		int result =0;
		try {
	List <WebElement> ele =	driver.findElements(By.xpath(Xpath));
	for(int i=0;i<ele.size();i++)
	{
		String value =ele.get(i).getText();
		int finalvalue = Integer.parseInt(value);
	result = result +finalvalue;
	}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		return result;}

	
	
	public void fetchgriddata(String Xpath)
	{
		try {
	List <WebElement> ele =	driver.findElements(By.xpath(Xpath));
	for(int i=0;i<ele.size();i++)
	{
		 String value= ele.get(i).getText();
		 log.info("Result "+value);
	}
		
	} catch (Exception e) {
		// TODO: handle exception
		log.info("Reuslt not found");
	}}
	
	
	
	
	public void verificationResult(String actual ,String expected)
	{
		
		try {
			
			Assert.assertEquals(actual, expected);
			log.info("actual == "+actual+"expected = "+expected);
		} catch (Exception e) {
			log.info("actual == "+actual+"expected = "+expected);
			// TODO: handle exception
		}
	}
	
	public String getText(String xpath)
	{
		
		String text="";
		try {
			
			 text=driver.findElement(By.xpath(xpath)).getText();
			 log.info("data selected"+text+"");
				
				
			
		} catch (Exception e) {
			// TODO: handle exception
			log.info("data not selected"+text+""+e.getMessage());
			e.printStackTrace();
			
		}
		return text;
		
		
		
		
	}
	
	
	public void draganddrop(String dragXpath,String dropXpath)
	{
		try {
			WebElement drag = driver.findElement(By.xpath(dragXpath));
			
			WebElement drop = driver.findElement(By.xpath(dropXpath));
			
			Actions ac= new Actions(driver);
			
			ac.dragAndDrop(drag, drop).build().perform();
			log.info("drag and drop successful");
		} catch (Exception e) {
			log.info("drag and drop not successful");
			// TODO: handle exception
		}
	}
	
	/*public void button(String Xpath)
	{
		try {
		driver.findElement(By.xpath(Xpath)).click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public void dropdown(String Xpath,String data)
	{
		try {
			WebElement wb = driver.findElement(By.xpath(Xpath));
			Select s = new Select(wb);
			s.selectByValue(data);
			log.info("Dropdown Value Selected "+data);
		} catch (Exception e) {
			
			log.info("Dropdown Value is not Selected "+data+""+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void click(String xpath) {
		// TODO Auto-generated method stub
		 try {
			 driver.findElement(By.xpath(xpath)).click();
			 log.info("button clicked");
		} catch (Exception e) {
			log.info("button not clicked"+ ""+e.getMessage());
			e.printStackTrace();
		}
	}

	public void clickusingActions(String xpath) {
		// TODO Auto-generated method stub
		 try {
			 WebElement ele=driver.findElement(By.xpath(xpath));
			 Actions ac=new Actions(driver);
			 ac.moveToElement(ele).click(ele).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			 log.info("button clicked");
		} catch (Exception e) {
			log.info("button not clicked"+ ""+e.getMessage());
			e.printStackTrace();
		}
	}
	public void clickusingJavascript(String xpath)
	{
		try {
			 WebElement ele=driver.findElement(By.xpath(xpath));
             ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
			log.info("button clicked");
			
		} catch (Exception e) {
			log.info("button not clicked"+"" +e.getMessage());
			// TODO: handle exception
		}
		
	}
	public void navigateforwardpage()
	{
		try {
			driver.navigate().forward();
			log.info("successfully moved forward");
		} catch (Exception e) {
			log.info("not moved forward");
		}
	}
	public void navigatebackpage()
	{
		try {
			driver.navigate().back();
			log.info("successfully moved backward");
		} catch (Exception e) {
			log.info("not moved backward");
		}
	}
	public void gettitle(String Xpath)
	{
		try {
			String title = driver.getTitle();
			System.out.println(title);
			log.info("title is displayed");
		} catch (Exception e) {
			log.info("title is not dsiplayed"+"" +e.getMessage());
			e.printStackTrace();
		}
	}
	//if i am not able to create a Xpath of particular element then i will create the Xpath of the 
	//neighbouring elemnt then i will press tab key after that i will enter data on particular element
	
	public void enterdatabyAction(String Xpath,String data)
	{
		try {
			WebElement ele = driver.findElement(By.xpath(Xpath));
			Actions ac= new Actions(driver);
			ac.moveToElement(ele).sendKeys(Keys.TAB).sendKeys(data).build().perform();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//if it is the same scenerio as above but i need to click on the neighbouring element instead of 
	//entering data
	
	
	public void clickbypressingtabkey(String Xpath,String data)
	{
		try {
			WebElement ele= driver.findElement(By.xpath(Xpath));
			Actions ac = new Actions(driver);
			ac.moveToElement(ele).sendKeys(Keys.TAB).click().build().perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	
	//here firstly i am pressing tab key with reference of neighbouring element by pressing enter key i will 
	//click on the element by pressing enter key
	public void clickbypressingtabandeneterkey(String Xpath)
	{
		try {
			WebElement ele= driver.findElement(By.xpath(Xpath));
			Actions ac = new Actions(driver);
			ac.moveToElement(ele).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// if you directly have to click on the button,without creating the xpath of the neighbouring element
	//if simple click or javascriptexceutor are not working then clickbypressingeneterkey is used
	
	public void clickbypressingeneterkey(String Xpath)
	{
		try {
			WebElement ele= driver.findElement(By.xpath(Xpath));
			Actions ac = new Actions(driver);
			ac.moveToElement(ele).sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public void clickdirectActions(String xpath) {
		// TODO Auto-generated method stub
		 try {
			 WebElement ele=driver.findElement(By.xpath(xpath));
			 Actions ac=new Actions(driver);
			 ac.moveToElement(ele).click(ele).build().perform();
			 log.info("button clicked");
		} catch (Exception e) {
			log.info("button not clicked"+ ""+e.getMessage());
			e.printStackTrace();
		}
	}
	/* public void Radiobutton(String Xpath)
	 {
		 try {
			driver.findElement(By.xpath(Xpath)).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }*/
	
	public void moveToFrame(String xpath) {
		
		
		
		try {
			
			
			driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public String getAttributeValue(String xpath,String attribute)
	{
		String text="";
try {
	 text=driver.findElement(By.xpath(xpath)).getAttribute(attribute);
	
	
	log.info("text value ="+text);
	
} catch (Exception e) {
	log.info("unable to find text value=");
	// TODO: handle exception
}
return text;		
		
		
		
	}
	
		
	
	public void mousehover(String Xpath)
	{
		try {
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath(Xpath));
			actions.moveToElement(mouseHover).build().perform();
			log.info("mouse hovered");
		} catch (Exception e) {
		log.info("mouse not hovered"+""+e.getMessage());
		e.printStackTrace();
		}
	}
	
	public void mousehoverAndClick(String Xpath)
	{
		try {
			Actions actions = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath(Xpath));
			actions.moveToElement(mouseHover).click(mouseHover).build().perform();
			log.info("mouse hovered");
		} catch (Exception e) {
		log.info("mouse not hovered"+""+e.getMessage());
		e.printStackTrace();
		}
	}
	
	
	
	
	
	public void symbol(String xpath) {
		// TODO Auto-generated method stub
		try {
			 driver.findElement(By.xpath(xpath)).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Hyperlink(String Xpath) {
		try {
		driver.findElement(By.xpath(Xpath)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void handleAlert(){
try {
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	log.info("Alert text: "+alert.getText());
	alert.accept();
	log.info("Alert is displayed");
} catch (Exception e) {
	log.info("Alert not displayed"+ ""+e.getMessage());
	e.printStackTrace();
}
	}
	
	public void dismissAlert(){
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			log.info("Alert text: "+alert.getText());
			alert.dismiss();
			log.info("Alert is displayed");
		} catch (Exception e) {
			log.info("Alert not displayed"+ ""+e.getMessage());
			e.printStackTrace();
		}
			}
	
	
	public void doubleclick(String xpath)
	{
		try {
			WebElement wb= driver.findElement(By.xpath(xpath));
			Actions ac= new Actions(driver);
			ac.doubleClick(wb).build().perform();
			log.info("double click successful");
		} catch (Exception e) {
			log.info("double click not successful");
			// TODO: handle exception
		}
	}
	
	public void rightclick(String Xpath)
	{
		try {
			WebElement wb= driver.findElement(By.xpath(Xpath));
			Actions ac = new Actions(driver);
			ac.contextClick(wb).build().perform();
			log.info("right clicked");
			
		} catch (Exception e) {
			log.info("right not clicked");
			// TODO: handle exception
		}
	}
	
	public void moveToNewWindow()
	{
		try {
			
			
			String mainwindow=driver.getWindowHandle();
			
			Set<String> set=driver.getWindowHandles();
			
			Iterator<String> itr=set.iterator();
			
			
			while(itr.hasNext())

			{
				
				
				String childwinow=itr.next();
				
				driver.switchTo().window(childwinow);
				System.out.println(driver.getTitle());
				log.info("moved to new window");
				
			}
					
			
				} catch (Exception e) {
			log.info("cannot move to new window");
			// TODO: handle exception
		}
	}
		

		
		public String MainWindow()
		{
			String mainwindow="";
			try {
				
				 mainwindow=driver.getWindowHandle();
				
					} catch (Exception e) {
				log.info("cannot move to new window");
				// TODO: handle exception
			}
			return mainwindow;
		
	}
	
		public void moveToMainWindow(String mainwindow)
		{
			try {
				driver.switchTo().window(mainwindow);
				
					} catch (Exception e) {
				log.info("cannot move to new window");
				// TODO: handle exception
				
				
								
			}
		
		}
		
		
		public void uploadfile(String Xpath,String filepath)
		{
			try {
				driver.findElement(By.xpath(Xpath)).sendKeys(filepath);
				log.info("file uploaded");
			} catch (Exception e) {
				log.info("file not uploaded");
				// TODO: handle exception
			}
		}
		
		
/*		public void checkbox(String)	
		
	

		public void enterdata1(String departmentcalenderdate, CharSequence[] i)
		{
			try {
				driver.findElement(By.xpath(departmentcalenderdate)).sendKeys(i);
				log.info("data entered");
				
			} catch (Exception e) {
				log.info("data not entered"+i+""+e.getMessage());
				// TODO: handle exception
			}
			
		}


		



	 public void selectCheck(){
	  //To select Cow checkbox using position() function.
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=3]")).click();
	  
	  //To select Lion checkbox using last() function.
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()-1]")).click();
	  
	  //To select Tiger checkbox using last() function.
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
	 }
	}*/
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	//Method for reading xls file using APACHE POI
		
		public void readxlsFile(String filename,int sheetinex)
		{
			
			try {
				
				
				//I have to check in my computer file present or not
				//Path in which i am reading path of xls file which is present under Testdata folder
				String path=System.getProperty("user.dir")+"\\Testdata\\"+filename;
				FileInputStream file=new FileInputStream(path);
				
				//Using Workbook factory i will read workbook
				
				Workbook book=WorkbookFactory.create(file);
				
				
				//So i am going to read sheetName
				
				Sheet sheet=book.getSheetAt(sheetinex);
				
				
				// Now i have to read one by one row and for every row 
				//i have to read all cells present under that row
				
				//i am going to read row
				
				Iterator<Row> rowitr=sheet.rowIterator();
				while(rowitr.hasNext())
				{
					
					Row rowvalue=rowitr.next();
					
					//Now i am going to read all cells for this row
					System.out.println("*************************************************");
					Iterator<Cell> cellitr=rowvalue.cellIterator();
					while(cellitr.hasNext())
					{
						
						Cell cellvalue=cellitr.next();
						
						switch (cellvalue.getCellType()) {
						case STRING:
							System.out.println(cellvalue.getStringCellValue());
							break;
                         case NUMERIC:
							System.out.println(cellvalue.getNumericCellValue());
							break;                      
                         case BOOLEAN:
                        	 System.out.println(cellvalue.getBooleanCellValue());
                        	 break;
                         case FORMULA:
                        	 System.out.println(cellvalue.getCellFormula());
                        	 break;
                         case BLANK:
                        	 System.out.println("");
                        	 break;
						default:
							System.out.println("None of the Above");
							break;
						}
						
					}
											
				}
				
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			
				
		}
				
	//Method for reading xls file using APACHE POI

		@SuppressWarnings("rawtypes")
		public Map<String, List> readxlsFileWithList(String filename,int sheetinex)
		{
			
			Map<String, List> map=new HashMap<String, List>();
			String tescaseid="";
			List li = null;
			try {
				
				
				//I have to check in my computer file present or not
				//Path in which i am reading path of xls file which is present under Testdata folder
				String path=System.getProperty("user.dir")+"\\Testdata\\"+filename;
				FileInputStream file=new FileInputStream(path);
				
				//Using Workbook factory i will read workbook
				
				Workbook book=WorkbookFactory.create(file);
				
				
				//So i am going to read sheetName
				
				Sheet sheet=book.getSheetAt(sheetinex);
				
				
				// Now i have to read one by one row and for every row 
				//i have to read all cells present under that row
				
				//i am going to read row
				
				Iterator<Row> rowitr=sheet.rowIterator();
				while(rowitr.hasNext())
				{
					
					Row rowvalue=rowitr.next();
					 li=new ArrayList();
					//Now i am going to read all cells for this row
					// I am assuming first cell value is test case id
					System.out.println("*************************************************");
					Iterator<Cell> cellitr=rowvalue.cellIterator();
					while(cellitr.hasNext())
					{
						
						Cell cellvalue=cellitr.next();
						
						switch (cellvalue.getCellType()) {
						case STRING:
							tescaseid=cellvalue.getStringCellValue();
							li.add(cellvalue.getStringCellValue());
							System.out.println(cellvalue.getStringCellValue());
							break;
                       case NUMERIC:
                    	   li.add(cellvalue.getNumericCellValue());
							System.out.println(cellvalue.getNumericCellValue());
							break;                      
                       case BOOLEAN:
                    	   li.add(cellvalue.getNumericCellValue());
                      	 System.out.println(cellvalue.getBooleanCellValue());
                      	 break;
                       case FORMULA:
                    	   li.add(cellvalue.getCellFormula());
                      	 System.out.println(cellvalue.getCellFormula());
                      	 break;
                       case BLANK:
                    	   li.add("");
                      	 System.out.println("");
                      	 break;
						default:
							System.out.println("None of the Above");
							break;
						}
					}
					map.put(tescaseid, li);	
					
							
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("***********************************");
			System.out.println(map);
			return map;
			
					}
		
		public void checkobjectattribute(String Xpath,String attribute) 
		{
			try {
			String value=driver.findElement(By.xpath(Xpath)).getAttribute(attribute);
			System.out.println(value);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//it is used for checking enable or disable for any object like checkbox,textbox,radiobutton or link
		public void checkelementenableordisbaled(String Xpath)
		{
			try {
		boolean flag=driver.findElement(By.xpath(Xpath)).isEnabled();
		if(flag)
		{
			System.out.println("element is enabled");
		}
			else
			{
				System.out.println("element is disabled");
		}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
			
		public void selectmultiplecheckboxandradiobutton(String Xpath)
		{
			try {
	List<WebElement> ele =driver.findElements(By.xpath(Xpath));
	for(int i=0;i<ele.size();i++)
	{
		boolean flag=ele.get(i).isSelected();  //iselected method is used for testing that whether checkbox isselected
		
		if(!flag)
		{
			ele.get(i).click();
		}
	}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
			
			public void checkcolor(String Xpath)
			{
				try {
				String color=driver.findElement(By.xpath(Xpath)).getCssValue("color");
				System.out.println(color);	
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		
		
		
		//method for entering data in multiple textbox
			//there will be two situations that you have to enter same or different data
			//1.to enter random number
			//method for random number
			
			public int randomnumber()
			{
				int randomnum=0;
				try {
					 randomnum=(int) ((Math.random())*1000);  //it will be multiple of 10 to generate random number
				} catch (Exception e) {
					// TODO: handle exception
				}
				return randomnum;
			}

		//method for entering data in multiple textbox
			//when you have a kind of form or registrationpage for which you have to test more then 100 set of datathen 
			 //rather then creating testdata(eg. like for 1testscript i need to check with 1000or any big number testdata )
			
		 public void enterinmultipletextbox(String Xpath,String data)
		 {
			try {
		List<WebElement> ele=driver.findElements(By.xpath(Xpath));
		for(int i=0; i <ele.size();i++)
		{
		int value=randomnumber();
			ele.get(i).sendKeys(data+String.valueOf(value));
		}
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
		 }
		
		
		
		
		
}






