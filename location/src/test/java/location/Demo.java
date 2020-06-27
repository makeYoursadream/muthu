package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Demo {
	

	WebDriver driver;
	
	@Given(": navigate to facebook")
	public void navigate_to_facebook() {
		
		
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
	}
	@When(": enter the mail and pawssword")
	public void enter_the_mail_and_pawssword(){
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("sbpmuthukumaran01@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("podapunda");
		
	}	
	
	@And(": click Login")
	public void click_Login() {
		
		WebElement login =driver.findElement(By.id("u_0_b"));
		login.click();
		
	}
	
	@Then(" : Check its login or not")
	public void Check_its_login_or_not() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
		
					
					.
		
	}

}
