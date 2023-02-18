package TestScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FourthTest extends BaseClass {

	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGear();
		home.clickskillrarydemoapp();
		web.hanlechildBrowser();
	
		soft.assertTrue(skillraryDemoAppPage.getpageHeader().isDisplayed());
	
		web.ScrolltoElement(skillraryDemoAppPage.getcontactus());
		skillraryDemoAppPage.ClickContactus();
		
		soft.assertTrue(contactUSpage.getpageHeader().isDisplayed());
		
		List<String> data=excel.fetchDataFromExcel("sheet1");
		contactUSpage.submitDeatils(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
	}
}
