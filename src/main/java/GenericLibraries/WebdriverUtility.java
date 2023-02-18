package GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains all reusable WebDriver methods
 * @author Monikrish
 *
 */

public class WebdriverUtility 
{
	WebDriver driver;
	
	/**
	 * This method is used to navigate to application
	 * @param browser
	 * @param time
	 * @param url
	 * @return
	 */
	public WebDriver openApplication(String browser, long time, String url)
	{
		switch (browser) 
		{
			case "chrome": driver=new ChromeDriver();break;
			case "edge": driver=new EdgeDriver();break;
			case "firefox": driver=new FirefoxDriver();break;
		default:
			System.out.println("Invalid Browser data");
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	/**
	 *  This method is used to mouse hover on particular element
	 * @param element
	 */
	public void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to double click on the element
	 * @param element
	 */
	public void doubleClickOnElemrnt(WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * This method is used to drag and drop an element to source to destination
	 * @param element
	 * @param source
	 * @param destiny
	 */
	public void dragAndDropElement(WebElement source, WebElement destiny)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source,destiny).perform();
	}
	
	/**
	 * This method is used to select an element from drop down based on index 
	 * @param element
	 * @param index
	 */
	public void dropdown(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method is used to select an element from drop down based on text
	 * @param element
	 * @param text
	 */
	public void dropdown(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to select an element from drop down based on value
	 * @param Value
	 * @param element
	 */
	public void dropdown(String Value, WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(Value);
	}
	/**
	 * This method is used to switch to frame
	 */
	public void switchToFrame()
	{
		driver.switchTo().frame(0);
	}
	
	/**
	 * This method is used to switch back from the frame
	 */
	public void switcBackfromFram()
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to handle alert pop up
	 */
	public void handleAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to handle child browser pop up
	 */
	public void hanlechildBrowser()
	{
		Set<String> windowsIDE=driver.getWindowHandles();
		for (String string : windowsIDE) 
		{
			driver.switchTo().window(string);
		}
	}
	
	/**
	 * This method is used to switch to parent window
	 */
	public void switchToParentWindow()
	{
		driver.switchTo().window(driver.getWindowHandle());
	}
	
	/**
	 * This method is used to scroll till the element
	 * @param object
	 */
	public void ScrolltoElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	/**
	 * This method is used to capture and save the screenshot in project
	 */
	public void takeScreenshort()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshort/picture.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to synchronize WebDriver methods
	 * @param time
	 * @param element
	 */
	public void ExplicitWait(long time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to close the current window or tab
	 */
	public void closecurrentwindow()
	{
		driver.close();
	}
	
	/**
	 * This method is used to close all tabs and exit the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
}
