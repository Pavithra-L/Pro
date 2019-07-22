package login;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class log {
	public static WebDriver driver;
	
@Given("I open the browser")
	public void i_open_the_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\Pavithra\\chromedriver.exe");
		driver= new ChromeDriver();
}

@Given("I enter the URL")
public void i_enter_the_URL() {
	driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm#");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);    
}

@Given("I Click on the SignInButton")
public void i_Click_on_the_SignInButton() {
	driver.findElement(By.linkText("SignIn")).click();
	     
}

@Given("Enter the credentials")
public void enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	driver.findElement(By.name("userName")).sendKeys(list.get(0).get("Username"));
    driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
}

@Then("I click on Login")
public void i_click_on_Login() {
	driver.findElement(By.name("Login")).click();
}

}
