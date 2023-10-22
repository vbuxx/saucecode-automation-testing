package Saucedemo.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Logout
{

    WebDriver driver; //
    String baseUrl="https://saucedemo.com/";
    @Given("Halaman login saucedemo2")
    public void halaman_login_saucedemo2()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        //driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("Input username2")

    public void inputUsername2()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password2")
    public void inputPassword2()
    {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }


    @And("User in on dashboard page2")
    public void userInOnDashboardPage2()
    {

        driver.findElement(By.id("header_container"));
        //driver.close();
    }

    @And("Click login button2")
    public void click_login_button2() {
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("login-button")).click();
        //driver.close();
    }

    @And("User klik menu button2")
    public void userKlikMenuButton2()
    {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        //driver.close();
    }

    @And("User klik menu logout2")
    public void userKlikMenuLogout2()
    {
        driver.findElement(By.id("logout_sidebar_link")).click();
        //driver.close();
    }

    @Then("User in login page2")
    public void userInLoginPage2()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name"));
        //driver.close();
    }
}
