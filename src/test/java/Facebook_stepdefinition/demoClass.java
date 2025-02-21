package Facebook_stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoClass {

	WebDriver driver=null;

	@Given("user login in the page")
	public void user_login_in_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	  driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//*[contains(@id,\"email\")]")).sendKeys("Kumar123@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kumar@123");
//		driver.findElement(By.xpath("//*[contains(@type,\"submit\")]")).click();
//		driver.close();
		System.out.println("Hellow");
	    
	}
	@When("user able to enter the username")
	public void user_able_to_enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@id,\"email\")]")).sendKeys("Kumar123@gmail.com");
	}

	@Then("user able to enter the password")
	public void user_able_to_enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kumar@123");
	    
	}


	@Then("user able to click the login button")
	public void user_able_to_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(@type,\"submit\")]")).click();
		System.out.println("excution done");
	    driver.close();
	}



}
