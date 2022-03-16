package functionsdefinitonfolder;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepfunctions{

WebDriver driver;
@Given("^user need to be on gmail login page$")
public void user_need_to_be_on_gmail_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\software-Testing\\softwarefiles\\chromedriver99\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.google.com/gmail/");
   
}

@Given("^user enter \"([^\"]*)\" in username field$")
public void user_enter_in_username_field(String username) throws Throwable {
	driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);
}

@Given("^clicks on next button in username page$")
public void clicks_on_next_button_in_username_page() throws Throwable {
	driver.findElement(By.xpath("//*[@id='identifierNext']/div/button")).click();
}

@Given("^user enter \"([^\"]*)\" as password$")
public void user_enter_as_password(String password) throws Throwable {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);

}

@Given("^clicks on next button in password page$")
public void clicks_on_next_button_in_password_page() throws Throwable {
	driver.findElement(By.xpath("//*[@id='passwordNext']/div/button")).click();
}

@Given("^clicks on compose button in gmail home page$")
public void clicks_on_compose_button_in_gmail_home_page() throws Throwable {
	driver.findElement(By.xpath("//div[@jscontroller='eIu7Db']")).click();
}

@When("^user enter blank data \"([^\"]*)\" in to field$")
public void user_enter_blank_data_in_to_field(String td1) throws Throwable {
	driver.findElement(By.xpath("//*[@name='to']")).sendKeys(td1);

}

@When("^user enter valid data \"([^\"]*)\"$")
public void user_enter_valid_data(String td2) throws Throwable {
	driver.findElement(By.xpath("//*[@name='to']")).sendKeys(td2);
}

@Then("^user gets a pop up \"([^\"]*)\" message$")
public void user_gets_a_pop_up_message(String pop1) throws Throwable {
  
	Alert alert = driver.switchTo().alert();
	String msg = alert.getText();
	boolean status = msg.equals(pop1);
	alert.accept();
	assertEquals(true,status);
  
}

@Then("^user clicks on send button in compose box$")
public void user_clicks_on_send_button_in_compose_box() throws Throwable {
	driver.findElement(By.xpath("//div[text()='Send']")).click();
	
}

@Then("^user gets pop \"([^\"]*)\" message$")
public void user_gets_pop_message(String popupmessage) throws Throwable {
	    WebElement ele = driver.findElement(By.xpath("//div[text()='Please specify at least one recipient.']"));
	    String a =ele.getText();
	  
}




@Then("^close the browser$")
public void close_the_browser() throws Throwable {
	Thread.sleep(5000);
	driver.close();
    
}

@When("^user enter invalid data \"([^\"]*)\"$")
public void user_enter_invalid_data(String td3) throws Throwable {
	driver.findElement(By.xpath("//*[@name='to']")).sendKeys(td3);
	
}

@When("^user enter valid data \"([^\"]*)\" in subject$")
public void user_enter_valid_data_in_subject(String td4) throws Throwable {
	driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys(td4);
}



@Then("^user takes a schreenshot \"([^\"]*)\"$")
public void user_takes_a_schreenshot(String pic1) throws Throwable {
	Thread.sleep(3000);
 
	Schreenshot.getPicture(driver, pic1);
}

@When("^user enter blank data \"([^\"]*)\" in body$")
public void user_enter_blank_data_in_body(String td5) throws Throwable {
   driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(td5);
}

@When("^user enter blank data \"([^\"]*)\" in subject$")
public void user_enter_blank_data_in_subject(String td6) throws Throwable {
	driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys(td6);
}


}