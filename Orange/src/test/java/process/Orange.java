package process;

import java.awt.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import io.cucumber.core.internal.gherkin.ast.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Orange {
	
	WebDriver driver;
	
	@Given("Login to url {string}")
	public void  Login_to_url(String url) {
		
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@When("enter the {string} and {string}")
	public void enter_the_email_and_password(io.cucumber.datatable.DataTable table) {
		
		
		/*java.util.List<Map<String, String>>cradential = table.asMaps(String.class,String.class);
		
		String user = cradential.get(1).get("username");
		String password = cradential.get(1).get("password");
		
		/*java.util.List<java.util.List<String>> cradential = table.asLists();
		
		String user = cradential.get(1).get(0);
		String password = cradential.get(1).get(1);
		
		
		/*Map<String, String>cradential = table.asMap(String.class, String.class);
	
		String user = cradential.get("username");
		String password = cradential.get("password");*/
		
		
		WebElement user_name=driver.findElement(By.id("txtUsername"));
		user_name.sendKeys(user);
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);
	}
	
	@And("click login")
	public void click_login() {
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	}
	
	@Then("conform the login page")
	public void conform_the_login_page() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
	}

}
