package POMpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumPage 
{
	//Declaration
	@FindBy(xpath = "//h2[@class=\"list_title\"]")
	private WebElement pageHeader;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavaForseleniumLink;
	
	//Initialization
	public CoreJavaSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public void clickcorejavaForSeleniumLink() {
		corejavaForseleniumLink.click();
	}
}
