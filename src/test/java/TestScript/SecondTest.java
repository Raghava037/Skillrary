package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class SecondTest extends BaseClass
{
	@Test
	public void secondTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGear();
		home.clickskillrarydemoapp();
		web.hanlechildBrowser();
		
		soft.assertTrue(skillraryDemoAppPage.getpageHeader().isDisplayed());
		
		skillraryDemoAppPage.selectCategory(web, 1);
		soft.assertEquals(testing.getpageHeader(),"Testing");
		
		web.dragAndDropElement(testing.getseleniumimg(), testing.getcartArea());
		web.ScrolltoElement(testing.getFacebookicon());
		testing.clickFacebookIcon();
		soft.assertAll();
	}

}
