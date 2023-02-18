package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {

	//Declaration 
	@FindBy(xpath = "//h1[text()='Core Java For Selenium Training']")
	private WebElement pageHeadear;
	
	@FindBy(xpath = "//button[@aria-label=\"Play\"]")
	private WebElement playbutton;
	
	@FindBy(xpath = "//button[@aria-label=\"Pause\"]")
	private WebElement pausebutton;
	
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addwishlistTab;
	
	@FindBy(xpath = "//a[text()='X']")
	private WebElement closecookies;
	
	//Initialization 
	public CoreJavaVideoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getpageHeader()
	{
		return pageHeadear.getText();
	}
	public void clickplayButton()
	{
		playbutton.click();
	}
	public void clickpauseButton()
	{
		pausebutton.click();
	}
	public void clickaddwishlist()
	{
		addwishlistTab.click();
	}
	public void clickclosecookies()
	{
		closecookies.click();
	}
}
