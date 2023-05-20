package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import Model.Locator;

public class Test_C extends Locator {
	
	
	 public String baseurl ="http://159.89.38.11/login"; 
	
	 
	 
	 
	 
	 
	 @Test
	  public void picture () throws InterruptedException {
		 
		 driver.get("http://159.89.38.11/login");
		 driver.manage().window().maximize();
		 
		 
		 Test_C Locator = new Test_C ();
		 
		 Locator.clicklogin();
		 Thread.sleep(1000);
		 Locator.clickgoogle();
		 Thread.sleep(1000);
		 Locator.clicksubmit();
		 
		
		 Thread.sleep(1000);
		 
		 
		
		 
		 
		// Locating the Main Menu (Parent element)
		 WebElement mainMenu = driver.findElement(By.xpath("//body/div[2]/div[1]/main[1]/aside[1]/div[1]"));

		 //Instantiating Actions class
		 Actions actions = new Actions(driver);

		 //Hovering on main menu
		 actions.moveToElement(mainMenu);

		 // Locating the element from Sub Menu
		 WebElement subMenu = driver.findElement(By.xpath("//span[contains(text(),'Contact Manage')]"));

		 //To mouse hovers on sub menu
		 actions.moveToElement(subMenu);

		 //build()- used to compile all the actions into a single step 
		 actions.click().build().perform();
		 Thread.sleep(2000);
		 
		 Locator.clickadd();
		 Thread.sleep(1000);
		 
		 
		
	   	 
	   
	    WebElement iframe = driver.findElement(By.xpath("//div[@id='form-modal']"));
        new Actions(driver).scrollToElement(iframe).perform();
   	 Thread.sleep(1000);
   	 
   	 
 
   	 	
   	 
   	 Locator.clicknum();
 	 Thread.sleep(3000);
	 Locator.clickemail();  	 
 	 Locator.clickfname();
 	 Locator.clicklname();	   	 
	   Locator.clickbd();
	   Thread.sleep(2000);
	   
	   Locator.clickcity();
	   Thread.sleep(2000);
	   Locator.clickstate();
	   Thread.sleep(2000);
	   Locator.clickzip();
	   Thread.sleep(2000);
	   Locator.clickcountry();
	   Thread.sleep(2000);
	   Locator.clickaddress();
	   Thread.sleep(2000);
	   Locator.clickaddbtn();
	   Thread.sleep(2000);
	   
	   
	   	 
	   	 
		 
		 
	
		
		
		 
		 
		 
		 
		 
		 
		
		 
		 
	
		 
		 
	 }
	
	

}
