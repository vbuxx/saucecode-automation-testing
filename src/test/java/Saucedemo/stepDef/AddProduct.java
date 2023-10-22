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

public class AddProduct
{
    WebDriver driver; //
    String baseUrl="https://saucedemo.com/";
    @Given("Halaman login saucedemo_")
    public void halaman_login_saucedemo_()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("Input username_")

    public void inputUsername_()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password_")
    public void inputPassword_()
    {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }


    @Then("User in on dashboard page_")
    public void userInOnDashboardPage_()
    {
        //driver.findElement(By.xpath("//div[contains(text(),'dashboard')]"));
        //String username= driver.findElement(By.xpath("//dd[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        //Assert.assertEquals(username,"SwagLab");
        driver.findElement(By.id("header_container"));
        //driver.close();
    }

    @And("Click login button_")
    public void click_login_button_() {
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("login-button")).click();
        //driver.close();
    }

    @And("User klik add to cart")
    public void userKlikAddToCart()
    {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //driver.close();
    }

    @And("User klik cart increment")
    public void userKlikCartIncrement()
    {
        driver.findElement(By.id("shopping_cart_container")).click();
        //driver.close();

    }

    @Then("User in payment cart")
    public void userInPaymentCart()
    {
        driver.findElement(By.id("cart_contents_container"));
    }

    @And("User klik remove product")
    public void userKlikRemoveProduct()
    {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
}
