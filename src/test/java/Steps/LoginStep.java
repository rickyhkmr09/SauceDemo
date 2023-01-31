package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStep {
	
	WebDriver driver = null;
	
	@Given("buka browser")
	public void buka_browser() {
		
		System.out.println("Inside Step - buka browser");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/WebDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	}

	@Given("user berada di halaman login")
	public void user_berada_di_halaman_login() {
		
		driver.navigate().to("https://www.saucedemo.com/");
	   
	}

	@When("user input username dan password")
	public void user_input_username_dan_password() throws InterruptedException {
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
	}
	
	@And("user klik tombol login")
	public void user_klik_tombol_login() {
	    
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user berada dihalaman beranda")
	public void user_berada_dihalaman_beranda() throws InterruptedException {
		
		driver.findElement(By.id("inventory_container")).isDisplayed();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	    
	}


}
