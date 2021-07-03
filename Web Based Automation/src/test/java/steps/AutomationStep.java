package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AutomationStep {

    protected WebDriver driver = null;

    @Before
    public void SetupRun(){
    	driver = new ChromeDriver();
    	}

    @Given("^User Open browser and open \"([^\"]*)\"$")
    public void userOpenBrowserAndOpen(String web) throws Throwable {
        driver.get(web);
        driver.manage().window().maximize();
    }

    @Then("^Click on the Sign in button$")
    public void click_on_the_Sign_in_button() throws Throwable {
        driver.findElement(By.className("header_user_info")).click();
    }

    @Then("^Insert Email Addresss \"([^\"]*)\"$")
    public void insert_Email_Addresss(String string) throws Throwable {
        driver.findElement(By.id("email_create")).sendKeys(string);
    }
    
    @Then("^Click on Create an Account$")
    public void click_on_Create_an_Account() throws Throwable {
        driver.findElement(By.id("SubmitCreate")).click();
    }

    @Then("^Choose Title$")
    public void choose_Title() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	WebElement selectGender = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='radio-inline']/label[@for='id_gender1']")));
    	selectGender.click();
    }

    @Then("^Fill in the First Name \"([^\"]*)\"$")
    public void fill_in_the_First_Name(String string1) throws Throwable {
        driver.findElement(By.id("customer_firstname")).sendKeys(string1);
    }

    @Then("^Fill in the Last Name \"([^\"]*)\"$")
    public void fill_in_the_Last_Name(String string2) throws Throwable {
        driver.findElement(By.id("customer_lastname")).sendKeys(string2);
    }

    @Then("^Fill in the Password \"([^\"]*)\"$")
    public void fill_in_the_Password(String string3) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(string3);
    }

    @Then("^Pick the Date of Birth$")
    public void pick_the_Date_of_Birth() throws Throwable {
        driver.findElement(By.id("days")).sendKeys("22");
        driver.findElement(By.id("months")).sendKeys("April");
        driver.findElement(By.id("years")).sendKeys("1994");

    }

    @Then("^Fill in the Company \"([^\"]*)\"$")
    public void fill_in_the_Company(String string4) throws Throwable {
        driver.findElement(By.id("firstname")).sendKeys("Hussein");
        driver.findElement(By.id("lastname")).sendKeys("Baashen");
        driver.findElement(By.id("company")).sendKeys(string4);
    }

    @Then("^Fill in the Address \"([^\"]*)\"$")
    public void fill_in_the_Address(String string5) throws Throwable {
        driver.findElement(By.id("address1")).sendKeys(string5);
    }

    @Then("^Fill in the City \"([^\"]*)\"$")
    public void fill_in_the_City(String string6) throws Throwable {
        driver.findElement(By.id("city")).sendKeys(string6);
    }

    @Then("^Pick the State$")
    public void pick_the_State() throws Throwable {
        driver.findElement(By.id("id_state")).sendKeys("Alabama");
    }

    @Then("^Fill the Zip Code \"([^\"]*)\"$")
    public void fill_the_Zip_Code(String string7) throws Throwable {
        driver.findElement(By.id("postcode")).sendKeys(string7);
    }

    @Then("^Pick the Country$")
    public void pick_the_Country() throws Throwable {
        driver.findElement(By.id("id_country")).sendKeys("United States");
    }

    @Then("^Insert Your Phone Number \"([^\"]*)\"$")
    public void insert_Your_Phone_Number(String string8) throws Throwable {
        driver.findElement(By.id("phone")).sendKeys(string8);
    }

    @Then("^Insert Your Mobile Number \"([^\"]*)\"$")
    public void insert_Your_Mobile_Number(String string9) throws Throwable {
        driver.findElement(By.id("phone_mobile")).sendKeys(string9);
    }

    @Then("^Fill in an Alias for Email Address  \"([^\"]*)\"$")
    public void fill_in_an_Alias_for_Email_Address(String string10) throws Throwable {
        driver.findElement(By.id("alias")).sendKeys(string10);
    }

    @Then("^Click on Register$")
    public void click_on_Register() throws Throwable {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^Navigated to the Profile Dashboard$")
    public void navigated_to_the_Profile_Dashboard() throws Throwable {
    	driver.findElement(By.className("info-account")).isDisplayed();
    }
}