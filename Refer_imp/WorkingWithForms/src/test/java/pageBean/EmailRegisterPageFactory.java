package pageBean;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailRegisterPageFactory {
	WebDriver driver;

	// step 1 : identify elements
	@FindBy(name = "txtUName")
	@CacheLookup
	WebElement txtUName;

	@FindBy(name = "txtPwd")
	@CacheLookup
	WebElement txtPwd;

	@FindBy(name= "txtConfPassword")
	@CacheLookup
	WebElement txtConfPassword;
	
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement txtFN;

	@FindBy(name = "txtLN")
	@CacheLookup
	WebElement txtLN;

	@FindBy(name= "gender")
	@CacheLookup
	WebElement gender;
	
	@FindBy(id="rbMale")
	@CacheLookup
	WebElement rbMale;
	@FindBy(id="rbFemale")
	@CacheLookup
	WebElement rbFemale;


	@FindBy(name = "DtOB")
	@CacheLookup
	WebElement DtOB;

	@FindBy(name = "Email")
	@CacheLookup
	WebElement Email;

	@FindBy(name= "Address")
	@CacheLookup
	WebElement Address;
	
	@FindBy(name = "City")
	@CacheLookup
	WebElement City;

	@FindBy(name = "Phone")
	@CacheLookup
	WebElement Phone;

	@FindBy(name= "chkHobbies")
	@CacheLookup
	List<WebElement> chkHobbies;
	
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement registerButton;


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getTxtUName() {
		return txtUName;
	}


	public void setTxtUName(String txtUName) {
		this.txtUName.sendKeys( txtUName);
	}


	public WebElement getTxtPwd() {
		return txtPwd;
	}


	public void setTxtPwd(String txtPwd) {
		this.txtPwd.sendKeys(txtPwd);
	}


	public WebElement getTxtConfPassword() {
		return txtConfPassword;
	}


	public void setTxtConfPassword(String txtConfPassword) {
		this.txtConfPassword.sendKeys(txtConfPassword);
	}


	public WebElement getTxtFN() {
		return txtFN;
	}


	public void setTxtFN(String txtFN) {
		this.txtFN.sendKeys(txtFN);
	}


	public WebElement getTxtLN() {
		return txtLN;
	}


	public void setTxtLN(String txtLN) {
		this.txtLN.sendKeys( txtLN);
	}


	public WebElement getGender() {
		return gender;
	}
	
	
	
	
	public WebElement getRbMale() {
		return rbMale;
	}


	public void setRbMale() {
		this.rbMale.click();
	}


	public WebElement getRbFemale() {
		return rbFemale;
	}


	public void setRbFemale() {
		this.rbFemale.click();
	}


	public void setGender(String gender) {
		
		if(gender.equalsIgnoreCase("Male"))
		{//this.rbMale.click();
			System.out.println("Gender Male selected");
			setRbMale();
		}	
		else if(gender.equalsIgnoreCase("Female"))
			//this.rbFemale.click();
			setRbFemale();
		
	}


	public WebElement getDtOB() {
		return DtOB;
	}


	public void setDtOB(String dtOB) {
		DtOB.sendKeys(dtOB);
	}


	public WebElement getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email.sendKeys( email);
	}


	public WebElement getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address.sendKeys( address);
	}


	public WebElement getCity() {
		return City;
	}


	public void setCity(String city) {
		City.sendKeys(city);
	}


	public WebElement getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone.sendKeys(phone);
	}


	public List<WebElement> getChkHobbies() {
		return chkHobbies;
	}


	public void setChkHobbies(List<String> chkHobbiesList) {
		
		for ( WebElement el : chkHobbies ) {
			if(chkHobbiesList.contains(el.getAttribute("value"))  && !el.isSelected())
				{
				System.out.println(el.getAttribute("value"));
				el.click();
				}
			else if(el.isSelected())
				el.click();
			
			
			
//			if ( !el.isSelected() ) {
//		        el.click();
//		    }
		}
		
	}


	public WebElement getRegisterButton() {
		return registerButton;
	}


	public void setRegisterButton() {
		this.registerButton.click();
	}


	public EmailRegisterPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
