package userDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.UserBean;

// implementating the feature file "information.feature" in programming style
public class userDefination {
	
	WebDriver driver;
	UserBean user;
	
	@Before
	public void setUp() {    // loading the chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\bdd\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();		
	}
	@Given("^user is on 'UserInformation' page$")
	public void user_is_on_UserInformation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\bdd\\UserInformation\\UserInformation.html");  // loading the UserInformation.html
	    user=new UserBean(driver);
	    Thread.sleep(1000);
	}

	@When("^user enters invalid Applicant name$")
	public void user_enters_invalid_Applicant_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		     user.setUcat();
		    user.setUname("");
		    user.setSubmit();
	}

	@Then("^displays 'Please fill the Applicant Name'$")
	public void displays_Please_fill_the_Applicant_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Applicant Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
	    user.setUname("Bishal");
	    user.setFname("");
	    user.setSubmit();
	}

	@Then("^displays 'Please fill the First Name'$")
	public void displays_Please_fill_the_First_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("");
	    user.setSubmit();
	}

	@Then("^displays 'Please fill the Last Name'$")
	public void displays_Please_fill_the_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid father name$")
	public void user_enters_invalid_father_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("");
	    user.setSubmit();
	}

	@Then("^displays 'Please fill the Father Name'$")
	public void displays_Please_fill_the_Father_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enters Date of birth$")
	public void user_does_not_enters_Date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("");
	    user.setSubmit();
	}

	@Then("^display 'Please fill the DOB'$")
	public void display_Please_fill_the_DOB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the DOB";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters Wrong Date of birth$")
	public void user_enters_Wrong_Date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12/11/1997");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please Enter valid date\\(dd-MM-yyyy\\)'$")
	public void display_Please_Enter_valid_date_dd_MM_yyyy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please Enter valid date(dd-MM-yyyy)";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not select gender$")
	public void user_does_not_select_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please select the Gender'$")
	public void display_Please_select_the_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please select the Gender";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enter mobile number$")
	public void user_does_not_enter_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please fill Mobile no'$")
	public void display_Please_fill_Mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill Mobile no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	@When("^user enters invalid mobile number$")
	public void user_enters_invalid_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("789456123");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please enter valid mobile no'$")
	public void display_Please_enter_valid_mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please enter valid mobile no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enter email$")
	public void user_does_not_enter_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("7894561230");
	    user.setEmail("");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please fill the Email id'$")
	public void display_Please_fill_the_Email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Email id";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid landline number$")
	public void user_enters_invalid_landline_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("7894561230");
	    user.setEmail("96bishal@gmail.com");
	    user.setLine("");
	    
	    user.setSubmit();
	}

	@Then("^display 'please fill the landline no'$")
	public void display_please_fill_the_landline_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="please fill the landline no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not select communication type$")
	public void user_does_not_select_communication_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("7894561230");
	    user.setEmail("96bishal@gmail.com");
	    user.setLine("123456");
	    
	    user.setSubmit();
	}

	@Then("^display 'Please select the Type of Communication'$")
	public void display_Please_select_the_Type_of_Communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please select the Type of Communication";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enters address$")
	public void user_does_not_enters_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("7894561230");
	    user.setEmail("96bishal@gmail.com");
	    user.setLine("123456");
	    user.setRadd();
	    user.setRes("");
	    
	    user.setSubmit();
	}

	@Then("^display 'please enter the Addresss'$")
	public void display_please_enter_the_Addresss() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="please enter the Addresss";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		user.setUcat();
		user.setUname("Bishal");
	    user.setFname("Bishal");
	    user.setLname("Roy");
	    user.setFtname("Bikram Roy");
	    user.setUdob("12-11-1997");
	    user.setMale();
	    user.setMob("7894561230");
	    user.setEmail("96bishal@gmail.com");
	    user.setLine("123456");
	    user.setRadd();
	    user.setRes("Hinjewadi");
	    
	    user.setSubmit();
	}

	@Then("^display 'Personal details are validated\\.'$")
	public void display_Personal_details_are_validated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Personal details are validated");
		 driver.get("D:\\bdd\\UserInformation\\PaymentDetails.html");  // redirecting to  the PaymentDetails.html
	}


}
