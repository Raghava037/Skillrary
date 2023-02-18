package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass
{
	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGear();
		home.clickskillrarydemoapp();
		web.hanlechildBrowser();
		
		soft.assertTrue(skillraryDemoAppPage.getpageHeader().isDisplayed());
		
		skillraryDemoAppPage.mouseHoverTocourse(web);
		skillraryDemoAppPage.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "elenium Training");
		selenium.doubleclickPlusButton(web);
		selenium.ClickAddToCart();
		web.handleAlert();
		web.ExplicitWait(time, selenium.getIteamAddedMessage());
		web.takeScreenshort();
		soft.assertTrue(selenium.getIteamAddedMessage().isDisplayed());
		
		soft.assertAll();
	}
}
