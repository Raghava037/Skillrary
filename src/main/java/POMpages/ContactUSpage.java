package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUSpage {

	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	@FindBy(name = "name")
	private WebElement fullnameTF;
	@FindBy(name = "sender")
	private WebElement emailTF;
	@FindBy(name = "subject")
	private WebElement subjectTF;
	@FindBy(name = "message")
	private WebElement messageTextArea;
	@FindBy(xpath = "//button[text()='Send us mail']")
	private WebElement sendusMailButton;
	
	//initialization
	public ContactUSpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getpageHeader()
	{
		return pageHeader;
	}
	
	public void submitDeatils(String name, String email, String subject, String message)
	{
		fullnameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendusMailButton.click();
	}
}
