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

    @When("I click on Signup Login button")
    public void i_click_on_signup_login_button() {
        driver.findElement(By.xpath("//header//a[text()=' Signup / Login']")).click();

    }
    @Then("I fill the signup form with the following data:")
    public void i_fill_the_signup_form_with_the_following_data(io.cucumber.datatable.DataTable dataTable) {
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(dataTable.cell(1,0));
        driver.findElement(By.xpath("//form/input[@data-qa='signup-email']")).sendKeys(dataTable.cell(1,1));
        System.out.println("Signup form filled with name: " + dataTable.cell(1,0) + " and email: " + dataTable.cell(1,1));
    }

    @Then("I click on signup button")
    public void i_click_on_signup_button() {
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Then("I should be navigated to Enter Account Information page")
    public void i_should_be_navigated_to_enter_account_information_page() {
        System.out.println("Navigated to Enter Account Information page");
    }

    @Then("I fill the account information form with the following data:")
    public void i_fill_the_account_information_form_with_the_following_data(io.cucumber.datatable.DataTable dataTable) {
        driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys(dataTable.cell(1,0));
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(dataTable.cell(1,1));
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(dataTable.cell(1,2));
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(dataTable.cell(1,3));
        driver.findElement(By.xpath("//select[@id='country']")).sendKeys(dataTable.cell(1,4));
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys(dataTable.cell(1,5));
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(dataTable.cell(1,6));
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys(dataTable.cell(1,7));
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(dataTable.cell(1,8));

    }

    @Then("I click on create account button")
    public void i_click_on_create_account_button() {
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
    }

    @Then("I should see a message {string}")
    public void i_should_see_a_message(String string) {
        System.out.println("Account created successfully message displayed: " + string);
    }



}