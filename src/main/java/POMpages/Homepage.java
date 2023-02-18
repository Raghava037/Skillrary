package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement search;
	@FindBy(xpath = "//input[@value=\"go\"]")
	private WebElement searchbutton;
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement GearTAb;
	@FindBy(xpath = "(//a[@target=\"_blank\"])[16]")
	private WebElement skillraryDEMo;
	
	
	//Initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getlogo()
	{
		return logo;
	}
	public void searchFor(String data) {
		search.sendKeys(data);
		searchbutton.click();
	}
	
	public void clickGear()
	{
		GearTAb.click();
	}
	public void clickskillrarydemoapp()
	{
		skillraryDEMo.click();
	}
	
}
