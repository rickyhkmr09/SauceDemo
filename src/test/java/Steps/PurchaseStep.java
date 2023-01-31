package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class PurchaseStep {
	
	WebDriver driver = null;
	
	@Given("buka browser untuk purchase")
	public void buka_browser_untuk_purchase() {
		
		System.out.println("Inside Step - buka browser untuk purchase");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/WebDriver/chromedriver.exe");
		
        driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	}

	@And("user berada di halaman login untuk purchase")
	public void user_berada_di_halaman_login_untuk_purchase() {
		
		driver.navigate().to("https://www.saucedemo.com/");
	    
	}

	@When("user input username dan password untuk purchase")
	public void user_input_username_dan_password_untuk_purchase() throws InterruptedException {
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
	    
	}

	@And("user klik tombol login untuk purchase")
	public void user_klik_tombol_login_untuk_purchase() throws InterruptedException {
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
	    
	}

	@Then("user berada dihalaman beranda untuk purchase")
	public void user_berada_dihalaman_beranda_untuk_purchase() throws InterruptedException {
		
		driver.findElement(By.id("inventory_container")).isDisplayed();
		
		Thread.sleep(2000);
	    
	}

	@And("user klik tombol add to chart")
	public void user_klik_tombol_add_to_chart() throws InterruptedException {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		Thread.sleep(2000);
	    
	}

	@And("user klik ikon keranjang")
	public void user_klik_ikon_keranjang() throws InterruptedException {
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
		Thread.sleep(2000);

	}

	@And("user klik tombol checkout")
	public void user_klik_tombol_checkout() throws InterruptedException {
		
		driver.findElement(By.id("checkout")).click();
		
		Thread.sleep(2000);
	    
	}

	@When("user input nama depan nama belakang dan postal code")
	public void user_input_nama_depan_nama_belakang_dan_postal_code() throws InterruptedException {
		
		driver.findElement(By.id("first-name")).sendKeys("ricky");
		driver.findElement(By.id("last-name")).sendKeys("hakim ronaldo");
		driver.findElement(By.id("postal-code")).sendKeys("1989");
		
		Thread.sleep(2000);
	    
	}

	@And("user klik tombol continue")
	public void user_klik_tombol_continue() throws InterruptedException {
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
	    
	}

	@And("user klik tombol finish")
	public void user_klik_tombol_finish() throws InterruptedException {
		
		driver.findElement(By.id("finish")).click();
		
		Thread.sleep(2000);
	    
	}

	@Then("user menyelesaikan pesanan")
	public void user_menyelesaikan_pesanan() throws InterruptedException {
		
		driver.findElement(By.id("checkout_complete_container")).isDisplayed();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
	    
	}


}
