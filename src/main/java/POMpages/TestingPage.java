package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	//declaration
	@FindBy(xpath = "//h1[text()='Testing']")
	private WebElement pageHeader;
	@FindBy(id = "Selenium Training")
	private WebElement seleniumimg;
	@FindBy(id = "cartArea")
	private WebElement cartArea;
	@FindBy(xpath = "/html/body/div[1]/footer/div/div[2]/div[1]/div[1]/ul/li[2]/a/i")
	private WebElement facebookIcon;
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getpageHeader()
	{
		return pageHeader.getText();
	}
	public WebElement getseleniumimg()
	{
		return seleniumimg;
	}
	public WebElement getcartArea()
	{
		return cartArea;
	}
	public WebElement getFacebookicon()
	{
		return facebookIcon;
	}
	public void clickFacebookIcon()
	{
		facebookIcon.click();
	}
}
