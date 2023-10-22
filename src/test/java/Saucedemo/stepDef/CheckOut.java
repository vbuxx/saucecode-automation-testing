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

public class CheckOut
{

    WebDriver driver; //
    String baseUrl="https://saucedemo.com/";
    @Given("Halaman login saucedemo1")
    public void halaman_login_saucedemo1()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("Input username1")

    public void inputUsername1()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password1")
    public void inputPassword1()
    {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }


    @Then("User in on dashboard page1")
    public void userInOnDashboardPage1()
    {
        //driver.findElement(By.xpath("//div[contains(text(),'dashboard')]"));
        //String username= driver.findElement(By.xpath("//dd[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        //Assert.assertEquals(username,"SwagLab");
        driver.findElement(By.id("header_container"));
        //driver.close();
    }

    @And("Click login button1")
    public void click_login_button1() {
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("login-button")).click();
        //driver.close();
    }

    @And("User klik add to cart1")
    public void userKlikAddToCart1()
    {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //driver.close();
    }

    @And("User klik cart increment1")
    public void userKlikCartIncrement1()
    {
        driver.findElement(By.id("shopping_cart_container")).click();
        //driver.close();
    }

    @Then("User in payment cart1")
    public void userInPaymentCart1()
    {
        driver.findElement(By.id("cart_contents_container"));
    }

    @And("User klik button chekout")
    public void userKlikButtonChekout()
    {
        driver.findElement(By.id("checkout")).click();
        //driver.findElement(By.className("btn btn_action btn_medium checkout_button"));
    }

    @Then("User in checkout information")
    public void userInCheckoutInformation()
    {
        driver.findElement(By.id("checkout_info_container"));
    }

    @And("User Input firstname")
    public void userInputFirstname()
    {
        driver.findElement(By.id("first-name")).sendKeys("Edi");
    }

    @And("User Input lastname")
    public void userInputLastname()
    {
        driver.findElement(By.id("last-name")).sendKeys("Cahyono");
    }

    @And("User Input postalcode")
    public void userInputPostalcode()
    {
        driver.findElement(By.id("postal-code")).sendKeys("32772");
    }

    @Then("User klik button continue")
    public void userKlikButtonContinue()
    {
        driver.findElement(By.id("continue")).click();
    }

    @Then("User in overview checkout")
    public void userInOverviewCheckout()
    {
        driver.findElement(By.id("checkout_summary_container"));
    }

    @Then("User klik finish")
    public void userKlikFinish()
    {
        driver.findElement(By.id("finish")).click();
    }

    @Then("User on page success checkout")
    public void userOnPageSuccessCheckout()
    {
        driver.findElement(By.id("checkout_complete_container"));
    }
}
