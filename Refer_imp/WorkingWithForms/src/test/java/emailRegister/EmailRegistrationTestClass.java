package emailRegister;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.EmailRegisterPageFactory;

public class EmailRegistrationTestClass {
	private WebDriver driver;
	private EmailRegisterPageFactory registerPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Sahil Workspace\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
	}
	
	@Given("^user is on 'EmailRegistration' page$")
	public void user_is_on_EmailRegistration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.get("D:\\Sahil Workspace\\BDD Workspace\\WorkingWithForms\\WorkingWithForms.html");
		registerPageFactory = new EmailRegisterPageFactory(driver);
		Thread.sleep(2000);
	}

	@When("^user enters invalid user name$")
	public void user_enters_invalid_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^displays 'Please fill the valid user Name'$")
	public void displays_Please_fill_the_valid_user_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill the valid user Name");
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^displays 'Please fill valid password'$")
	public void displays_Please_fill_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill valid password");
	}

	@When("^user enters confirm password not matching with password field$")
	public void user_enters_confirm_password_not_matching_with_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("123");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Passwords not matching'$")
	public void display_Passwords_not_matching() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Password and Confirm Password do not match");
	}

	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please fill valid first name'$")
	public void display_Please_fill_valid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill valid first name");
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("");
		registerPageFactory.setRegisterButton();
		
	}

	@Then("^display 'Please enter valid last name'$")
	public void display_Please_enter_valid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill valid last name");
	}

	@When("^user does not select radio button field gender$")
	public void user_does_not_select_radio_button_field_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please select gender'$")
	public void display_Please_select_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please select Gender");
	}

	@When("^user does not select proper DOB$")
	public void user_does_not_select_proper_DOB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("09/06/2025");
		String expectedMessage="You cannot enter a date in the future!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please Select DOB in Calendar'$")
	public void display_Please_Select_DOB_in_Calendar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
//		String expectedMessage="You cannot enter a date in the future!";
//		String actualMessage=driver.switchTo().alert().getText();
//		Assert.assertEquals(expectedMessage, actualMessage);
//		driver.switchTo().alert().accept();
		System.out.println("You cannot enter a date in the future!");
		//driver.close();
	}

	@When("^user enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		

		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^displays 'Please fill valid Email'$")
	public void displays_Please_fill_valid_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill valid email");
	}

	@When("^user enters invalid address$")
	public void user_enters_invalid_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("sahil@gmail.com");
		registerPageFactory.setAddress("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please fill valid Address'$")
	public void display_Please_fill_valid_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please fill valid Address");
	}

	@When("^user does not select city$")
	public void user_does_not_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("sahil@gmail.com");
		registerPageFactory.setAddress("ABc Hinjewaji Phase 3 Pin Code 411057");
		registerPageFactory.setCity("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please select your city'$")
	public void display_Please_select_your_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please select your city");
		
	}

	@When("^user enters invalid phone$")
	public void user_enters_invalid_phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("sahil@gmail.com");
		registerPageFactory.setAddress("ABc Hinjewaji Phase 3 Pin Code 411057");
		registerPageFactory.setCity("Pune");
		registerPageFactory.setPhone("");
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please enter valid Phone'$")
	public void display_Please_enter_valid_Phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please enter valid phone");
	}

	@When("^user does not select hobbies checkbox$")
	public void user_does_not_select_hobbies_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("sahil@gmail.com");
		registerPageFactory.setAddress("ABc Hinjewaji Phase 3 Pin Code 411057");
		registerPageFactory.setCity("Pune");
		registerPageFactory.setPhone("1234567890");
		registerPageFactory.setChkHobbies(new ArrayList<String>());
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Please select your hobbies'$")
	public void display_Please_select_your_hobbies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Please select your hobbies");
	}

	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setTxtUName("Sahil");
		registerPageFactory.setTxtPwd("abc");
		registerPageFactory.setTxtConfPassword("abc");
		registerPageFactory.setTxtFN("Sahil");
		registerPageFactory.setTxtLN("Bhatia");
		registerPageFactory.setGender("Male");
		registerPageFactory.setDtOB("05/20/1994");
		registerPageFactory.setEmail("sahil@gmail.com");
		registerPageFactory.setAddress("ABc Hinjewaji Phase 3 Pin Code 411057");
		registerPageFactory.setCity("Pune");
		registerPageFactory.setPhone("1234567890");
		registerPageFactory.setChkHobbies(new ArrayList<String>(Arrays.asList("Music", 
                "Reading")));
		registerPageFactory.setRegisterButton();
	}

	@Then("^display 'Email Registration Completed'$")
	public void display_Email_Registration_Completed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Sahil Workspace\\BDD Workspace\\WorkingWithForms\\success.html");
	}

	
}
