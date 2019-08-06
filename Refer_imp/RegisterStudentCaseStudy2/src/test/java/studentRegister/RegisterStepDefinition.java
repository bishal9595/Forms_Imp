package studentRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.RegisterPageFactory;

public class RegisterStepDefinition {
	private WebDriver driver;
	private RegisterPageFactory registerPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Sahil Workspace\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
	}
	
	@Given("^User is on 'register' Page$")
	public void user_is_on_register_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Sahil Workspace\\BDD Workspace\\RegisterStudentCaseStudy2\\register.html");
		registerPageFactory = new RegisterPageFactory(driver);
		Thread.sleep(2000);
		//driver.close();
	
		
	}

	@When("^user enters invalid studName$")
	public void user_enters_invalid_studName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setStudName("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
	}

	@Then("^display 'Please Enter Valid Student Name'$")
	public void display_Please_Enter_Valid_Student_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Please Enter Valid Student Name");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters does not enters name$")
	public void user_enters_does_not_enters_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		registerPageFactory.setStudName("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
		
	}

	@Then("^display 'Please Enter  Student Name'$")
	public void display_Please_Enter_Student_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		System.out.println("Please Enter Valid Student Name");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters does not enters address$")
	public void user_enters_does_not_enters_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setStudName("asdf");
		registerPageFactory.setStudAddress("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
		
	}

	@Then("^display 'Please Enter  Student Address'$")
	public void display_Please_Enter_Student_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		System.out.println("Please Enter Valid Student Address");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters does not enters marks$")
	public void user_enters_does_not_enters_marks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setStudName("asdf");
		registerPageFactory.setStudAddress("Pune");
		registerPageFactory.setStudMarks("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
	}

	@Then("^display 'Please Enter  Student Marks'$")
	public void display_Please_Enter_Student_Marks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();


		System.out.println("Please Enter Valid Student Marks");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters invalid address$")
	public void user_enters_invalid_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setStudName("asdf");
		registerPageFactory.setStudAddress("");
		registerPageFactory.setStudMarks("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
	}

	@Then("^display 'Please Enter Valid Student Address'$")
	public void display_Please_Enter_Valid_Student_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		System.out.println("Please Enter Valid Student Address");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters invalid marks$")
	public void user_enters_invalid_marks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setStudName("asdf");
		registerPageFactory.setStudAddress("xyz");
		registerPageFactory.setStudMarks("");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
	}

	@Then("^display 'Please Enter Valid Student Marks'$")
	public void display_Please_Enter_Valid_Student_Marks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		System.out.println("Please Enter Valid Student Marks");
		Thread.sleep(2000);
		//driver.close();
	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();

		registerPageFactory.setStudName("asdf");
		registerPageFactory.setStudAddress("xyz");
		registerPageFactory.setStudMarks("25");
		registerPageFactory.setRegisterButton();
		Thread.sleep(2000);
		//driver.close();
	}

	@Then("^display 'success' Page$")
	public void display_success_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Sahil Workspace\\BDD Workspace\\RegisterStudentCaseStudy2\\success.html");
		Thread.sleep(2000);
		//driver.close();
	}

}
