package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchField;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement submit;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")
	WebElement image;
	
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void checkSearchField(String un)
	{
		searchField.sendKeys(un);
	}
	
	public void clickBtn()
	{
		submit.click();
		image.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

}
