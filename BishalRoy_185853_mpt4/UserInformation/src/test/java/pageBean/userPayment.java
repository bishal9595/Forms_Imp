package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class userPayment {
	
	
	WebDriver driver;
	public userPayment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='txtCardholderName']")
	@CacheLookup
	WebElement cardHolderName;  // Card Holder name

	@FindBy(xpath="//*[@id='txtDebit']")
	@CacheLookup
	WebElement debitNo; // Debit card number

	@FindBy(xpath="//*[@id='txtCvv']")
	@CacheLookup
	WebElement cvv;  // cvv number of the card
	
	@FindBy(xpath="//*[@id='txtMonth']")
	@CacheLookup
	WebElement expiryMonth; // expiry month of the card 
	
	@FindBy(name="year")
	@CacheLookup
	WebElement year;  //expiry year of the card
	
	@FindBy(id ="btnPayment")
	@CacheLookup
	WebElement pay;  // submission button for validation

	
	public WebElement getPay() {
		return pay;
	}
	public void setPay() {
		this.pay.click();
	}
	public WebElement getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}
public WebElement getDebitNo() {
		return debitNo;
	}
	public void setDebitNo(String debitNo) {
		this.debitNo.sendKeys(debitNo);
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth.sendKeys(expiryMonth);
	}
	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	public WebElement getYear() {
		return year;
	}
}
