package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebdriverUtility;

public class SeleniumTrainingPage 
{
	//declaration
	@FindBy(xpath = "//h1[@class=\"page-header\"]")
	private WebElement PageHeader;
	@FindBy(id = "add")
	private WebElement plusButton;
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addcart;
	@FindBy(xpath = "//div[@id=\"callout\"]")
	private WebElement iteamAddedMessage;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getPageHeader()
	{
		return PageHeader.getText();
	}
	public void doubleclickPlusButton(WebdriverUtility web) {
		web.doubleClickOnElemrnt(plusButton);
	}
	public void ClickAddToCart()
	{
		addcart.click();
	}
	public WebElement getIteamAddedMessage()
	{
		return iteamAddedMessage;
	}
}
