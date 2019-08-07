package userPayment;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.UserBean;
import pageBean.userPayment;
//Implementing the feature file "payment.feature" in programming style
public class TestClass {
	WebDriver driver;
	userPayment payment;
	@Before
	public void setUp() {   // loading the chromedriver
		System.setProperty("webdriver.chrome.driver",
				"D:\\bdd\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();		
	}
	@Given("^user is on 'payment' page$")
	public void user_is_on_payment_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\bdd\\UserInformation\\PaymentDetails.html");  // loading the PaymentDetails.html
	    payment=new userPayment(driver);
	}

	@When("^user enters invalid name$")
	public void user_enters_invalid_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setCardHolderName("");
		payment.setPay();
	}

	@Then("^displays 'Please fill the Card holder name'$")
	public void displays_Please_fill_the_Card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Debit Card Number$")
	public void user_enters_invalid_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payment.setCardHolderName("Bishal Roy");
		payment.setDebitNo("");
		payment.setPay();
	}

	@Then("^displays 'Please fill the Debit card Number'$")
	public void displays_Please_fill_the_Debit_card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^user enters invalid cvv$")
	public void user_enters_invalid_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payment.setCardHolderName("Bishal Roy");
		payment.setDebitNo("1234567891234560");
		payment.setCvv("");
		payment.setPay();
	}

	@Then("^displays 'Please fill the CVV'$")
	public void displays_Please_fill_the_CVV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration month$")
	public void user_enters_invalid_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payment.setCardHolderName("Bishal Roy");
		payment.setDebitNo("1234567891234560");
		payment.setCvv("122");
		payment.setExpiryMonth("");
		payment.setPay();
	}

	@Then("^displays 'Please fill expiration month'$")
	public void displays_Please_fill_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration year$")
	public void user_enters_invalid_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payment.setCardHolderName("Bishal Roy");
		payment.setDebitNo("1234567891234560");
		payment.setCvv("122");
		payment.setExpiryMonth("12");
		payment.setYear("");
		payment.setPay();
	}

	@Then("^displays 'Please fill the expiration year'$")
	public void displays_Please_fill_the_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid payment details$")
	public void user_enters_valid_payment_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payment.setCardHolderName("Bishal Roy");
		payment.setDebitNo("1234567891234560");
		payment.setCvv("122");
		payment.setExpiryMonth("12");
		payment.setYear("2030");
		payment.setPay();
	}

	@Then("^displays 'Pan Card Registration Done Successfully!!!'$")
	public void displays_Pan_Card_Registration_Done_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Pan Card Registration Done Successfully!!!");
	}

}
