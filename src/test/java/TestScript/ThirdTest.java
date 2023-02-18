package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;




public class ThirdTest extends BaseClass
{
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		corejava.clickcorejavaForSeleniumLink();
		soft.assertEquals(javavideo.getpageHeader(), "Core Java For Selenium Training");
		
		javavideo.clickclosecookies();
		web.switchToFrame();
		javavideo.clickplayButton();
		Thread.sleep(2000);
		javavideo.clickpauseButton();
		
		web.switcBackfromFram();
		javavideo.clickaddwishlist();
		soft.assertAll();
		
	}
}
