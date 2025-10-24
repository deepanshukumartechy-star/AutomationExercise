package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static rst.pdfbox.layout.text.annotations.Annotations.HyperlinkAnnotation.LinkStyle.ul;
import static stepDefinition.Hooks.driver;

public class AEStepDefinition {


    @Given("navigate to {string}")
    public void navigate_to(String url) {
        driver.get(url);
    }

    @Then("verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualResult = driver.findElement(By.xpath("//*[@id='slider-carousel']/div/div[1]/div[1]/h2")).getText();
        String expectedResult = "Full-Fledged practice website for Automation Engineers";
        if (actualResult.equals(expectedResult)) {
            System.out.println("Home page is visible successfully. Test Passed");

        }
    }

    @When("I click on Products button")
    public void i_click_on_button() {
        driver.findElement(By.xpath("//header//a[text()=' Products']")).click();

    }
    @Then("I should be navigated to products page successfully")
    public void i_should_be_navigated_to_products_page_successfully() {

    }

    @When("I click on view product")
    public void i_click_on_view_product() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        driver.findElement(By.xpath("(//div[@class='choose']/ul/li/a[contains(text(),'View Product')])[1]")).click();
    }
    @Then("I click on add to cart button")
    public void i_click_on_add_to_cart() {
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
    }
    @Then("click on continue shopping button")
    public void click_on_continue_shopping_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-dismiss='modal']"))).click();
    }

}