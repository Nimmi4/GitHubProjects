package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ObjectRepository.OR;
import util.CommonFunctions;
import util.TestMethodSetup;

public class CricBuzz extends TestMethodSetup{
	@Test
	public void testInitiator()
	{
		CommonFunctions cf = new CommonFunctions();
		cf.OpenUrl(OR.cricbuzzurl);
		WebElement table= driver.findElement(By.cssSelector("cb-col cb-scrcrd-status cb-col-100 cb-text-complete ng-scope"));
	 int rowcount =	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	}

}
