package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import POMpages.ContactUSpage;
import POMpages.CoreJavaSeleniumPage;
import POMpages.CoreJavaVideoPage;
import POMpages.Homepage;
import POMpages.SeleniumTrainingPage;
import POMpages.SkillraryDemoAppPage;
import POMpages.TestingPage;

public class BaseClass 
{
	protected properties_File_utility property;
	protected ExcelUtility excel;
	protected WebdriverUtility web;
	protected WebDriver driver;
	protected Homepage home;
	protected SkillraryDemoAppPage skillraryDemoAppPage;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaSeleniumPage corejava;
	protected CoreJavaVideoPage javavideo;
	protected ContactUSpage contactUSpage;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classconfiguration() {
		property= new properties_File_utility();
		excel=new ExcelUtility();
		web= new WebdriverUtility();
		
		property.propertieFileinitialization(IConstantPath.PROPERRIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		
		
	}
	
	@BeforeMethod
	public void methodconfiguration() 
	{
		time=Long.parseLong(property.featchproperties("timeouts"));
		driver= web.openApplication(property.featchproperties("browser"), time, property.featchproperties("url"));	
		
		home =new Homepage(driver);
		
		Assert.assertTrue(home.getlogo().isDisplayed());
		
		skillraryDemoAppPage=new SkillraryDemoAppPage(driver);
		selenium=new SeleniumTrainingPage(driver);
		corejava =new CoreJavaSeleniumPage(driver);
		javavideo=new CoreJavaVideoPage(driver);
		testing=new TestingPage(driver);
		contactUSpage=new ContactUSpage(driver);
		
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
	
	
}
