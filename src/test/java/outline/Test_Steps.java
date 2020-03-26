package outline;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
 WebDriver driver;
 @Given("^User is on Home Page$")
 public void user_is_on_Home_Page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "E:\\WorkOffice\\ChromeDriver\\chromedriver.exe");
 driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
 }
 
// @When("^User Navigate to LogIn Page$")
// public void user_Navigate_to_LogIn_Page() throws Throwable {
// driver.findElement(By.xpath(".//*[@id='account']/a")).click();
// }
 
 @When("^User enters Credentials to LogIn$")
 public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
 List<List<String>> data = usercredentials.raw();
 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0)); 
     driver.findElement(By.name("pass")).sendKeys(data.get(0).get(1));
     driver.findElement(By.id("u_0_b")).click();
 }
 
 @Then("^Message displayed Login Successfully$")
 public void message_displayed_Login_Successfully() throws Throwable {
 System.out.println("Login Successfully");
 }
}