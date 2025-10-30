package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LearnPseudoElements {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://play1.automationcamp.ir/advanced.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String elementvalue =js.executeScript("return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')").toString();
        String modifiedvalue=elementvalue.replace("\"","");

        System.out.println(modifiedvalue);

        driver.findElement(By.id("txt_rating")).sendKeys(modifiedvalue);
        driver.findElement(By.id("check_rating")).click();
        boolean welldone=driver.findElement(By.id("validate_rating")).isDisplayed();
        System.out.println("Is well done displayed: "+welldone);
    }
}
