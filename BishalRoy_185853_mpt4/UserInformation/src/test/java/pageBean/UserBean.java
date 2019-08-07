package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserBean {
	
	WebDriver driver;
	public UserBean(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "rdbCategory")
	@CacheLookup
	WebElement ucat;  //category
	
	@FindBy(name = "txtNM")
	@CacheLookup
	WebElement uname;  // name of the user
	
	@FindBy(xpath="//*[@id='txtLastName']")
	@CacheLookup
	WebElement fname;  // first name
	
	@FindBy(xpath="//*[@id='txtLastName']")
	@CacheLookup
	WebElement lname; // last name
	
	@FindBy(name = "txtFtName")
	@CacheLookup
	WebElement ftname; // father name
	
	@FindBy(id = "txtDOB")
	@CacheLookup
	WebElement udob; //date of birth
	
	@FindBy(id="rdbMale")
	@CacheLookup
	WebElement male; // for male selection
	
	@FindBy(id="rdbFemale")
	@CacheLookup
	WebElement female;  // for Female selection
	
	@FindBy(name = "txtMNo")
	@CacheLookup
	WebElement mob;  // mobile no
	
	@FindBy(name = "txtEmailID")
	@CacheLookup
	WebElement email;  //email id
	
	@FindBy(name = "txtLLine")
	@CacheLookup
	WebElement line;  // landline no
	
	@FindBy(name = "rdbRAddress")
	@CacheLookup
	WebElement radd;  // resendential address of the user
	
	@FindBy(name = "rdbOffAddress")
	@CacheLookup
	WebElement oadd;  // office address of the user
	
	@FindBy(name = "resAddress")
	@CacheLookup
	WebElement res;  //home address of the user
	
	
	@FindBy(name = "bnSubmit")
	@CacheLookup
	WebElement submit;  // submit button for submission
	
	
	// generating getters and setters for the web elements
	
	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getUcat() {
		return ucat;
	}


	public void setUcat() {
		this.ucat.click();
	}


	public WebElement getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}


	public WebElement getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.uname.sendKeys(fname);
	}


	public WebElement getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}


	public WebElement getFtname() {
		return ftname;
	}


	public void setFtname(String ftname) {
		this.ftname.sendKeys(ftname);
	}


	public WebElement getUdob() {
		return udob;
	}


	public void setUdob(String udob) {
		this.udob.sendKeys(udob);
	}


	public WebElement getMale() {
		return male;
	}


	public void setMale() {
		this.male.click();
	}


	public WebElement getFemale() {
		return female;
	}


	public void setFemale() {
		this.female.click();
	}


	public WebElement getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob.sendKeys(mob);
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email.sendKeys(email);
	}


	public WebElement getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line.sendKeys(line);
	}


	public WebElement getRadd() {
		return radd;
	}


	public void setRadd() {
		this.radd.click();
	}


	public WebElement getOadd() {
		return oadd;
	}


	public void setOadd() {
		this.oadd.click();
	}


	public WebElement getRes() {
		return res;
	}


	public void setRes(String res) {
		this.res.sendKeys(res);
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void setSubmit() {
		this.submit.click();
	}

	
	
	
}
