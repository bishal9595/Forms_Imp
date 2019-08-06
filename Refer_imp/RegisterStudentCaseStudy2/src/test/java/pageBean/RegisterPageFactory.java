package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFactory {

	WebDriver driver;

	// step 1 : identify elements
	@FindBy(name = "studName")
	@CacheLookup
	WebElement studName;

	@FindBy(name = "studAddress")
	@CacheLookup
	WebElement studAddress;

	@FindBy(name= "studMarks")
	@CacheLookup
	WebElement studMarks;

	@FindBy(className="btn")
	@CacheLookup
	WebElement registerButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName.sendKeys(studName); 
	}

	public WebElement getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress.sendKeys(studAddress);
	}

	public WebElement getStudMarks() {
		return studMarks;
	}

	public void setStudMarks(String studMarks) {
		this.studMarks.sendKeys(studMarks); 
		}

	public RegisterPageFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton() {
		this.registerButton.click();
	}

	// initiating Elements
	public RegisterPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
