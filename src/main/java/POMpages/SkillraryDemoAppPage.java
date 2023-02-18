package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebdriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	@FindBy(xpath = "//a[@class=\"navbar-brand\"]")
	private WebElement pageHeader;
	@FindBy(id = "course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTraining;
	@FindBy(name = "addresstype")
	private WebElement categeryDropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactuslink;
	
	//initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getpageHeader()
	{
		return pageHeader;
	}
	
	public void mouseHoverTocourse(WebdriverUtility web)
	{
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining() {
		seleniumTraining.click();
	}
	public void selectCategory(WebdriverUtility web,int index) {
		web.dropdown(categeryDropdown,index);
	}
	public void ClickContactus()
	{
		contactuslink.click();
	}

	public WebElement getcontactus() {
		
		return contactuslink;
	}
}
