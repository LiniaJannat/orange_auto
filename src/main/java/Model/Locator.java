package Model;

import org.openqa.selenium.By;

import Base.DriverSet;

public class Locator extends DriverSet {
	
	By login = By.xpath("//input[@id='email-1']");
	By google = By.xpath("//input[@id='password-1']");
	By submit = By.xpath("//button[@id='m_login_signin_submit']");
	By add = By.xpath("//a[normalize-space()='Add Contact']");
	By number= By.xpath("//body/div[@id='form-modal']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]");
	By Email =  By.xpath("//input[@placeholder='Enter Email address']");
	By fname = By.xpath("//input[@placeholder='Enter First name']");
	By lastname = By.xpath("//input[@placeholder='Enter Last name']");
	By Birthday = By.xpath ("//input[@placeholder='Enter your birthday']");
	By city = By.xpath("input[placeholder='Enter your city']");
	By state = By.xpath("//input[@placeholder='Enter your state']");
	By zip = By.xpath("//input[@placeholder='Enter your zip']");
	By country = By.xpath("//input[@placeholder='Enter your country']");
	By address = By.xpath ("//textarea[@placeholder='Enter your address']");
	By addbutton = By.xpath("//button[normalize-space()='Add Contact']");
	

	
	
	public void clicklogin () {
		driver.findElement(login).sendKeys("test@orangetoolz.com");
	}
	
	public void clickgoogle() {
		driver.findElement(google).sendKeys("8Kh8nTe*^jdk");
	}
	
	public void clicksubmit () {
		
		driver.findElement(submit).click();
	}
	
	public void clickadd () {
		driver.findElement(add).click();
	}
		
	
	
	public void clicknum () {
		driver.findElement(number).sendKeys("89754");
		}
	
	public void clickemail ()
	{
		driver.findElement(Email).sendKeys("asd@gmail.com");
	}

	
	public void clickfname () {
		
		driver.findElement(fname).sendKeys("Summer");
	}
	
	public void clicklname () {
		
		driver.findElement(lastname).sendKeys("hamlet");
	}
	
	
	
	public void clickbd () {
		driver.findElement(Birthday).sendKeys("2013-11-04");
	}
	
	
	public void clickcity () {
		driver.findElement(city).sendKeys("dhaka");
	}
	
	public void clickstate () {
		driver.findElement(state).sendKeys("dhk");
	}
	public void clickzip () {
		driver.findElement(zip).sendKeys("2000");
	}
	 public void clickcountry () {
		 driver.findElement(country).sendKeys("dhaka");
	 }
	 
	 public void clickaddress () {
		 driver.findElement(address).sendKeys("adre");
	 }
	
	 public void clickaddbtn () {
		 driver.findElement(addbutton).click();
	 }
	
	
	
	
	
		
}
